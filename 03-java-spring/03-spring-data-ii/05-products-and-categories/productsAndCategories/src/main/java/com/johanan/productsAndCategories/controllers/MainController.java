package com.johanan.productsAndCategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johanan.productsAndCategories.models.Category;
import com.johanan.productsAndCategories.models.Product;
import com.johanan.productsAndCategories.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServe;
	
	@GetMapping("/")
	public String mainP(Model model) {
		List<Product> products = mainServe.allProducts();
		List<Category> categories = mainServe.allCategory();
		model.addAttribute("cat", categories);
		model.addAttribute("prods", products);
		return "mainP.jsp";
	}
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("product")Product product) {
		return "newProd.jsp";
	}
	@PostMapping("/product/create")
	public String createProduct(@Valid @ModelAttribute("product")Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProd.jsp";
		}else {
			mainServe.createProd(product);
			return "redirect:/";
		}
	}
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category")Category category) {
		return "newCat.jsp";
	}
	@PostMapping("/category/create")
	public String createCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCat.jsp";
		}else {
			mainServe.createCat(category);
			return "redirect:/";
		}
	}
	@GetMapping("/products/{id}")
	public String showProd(@PathVariable("id") Long id, Model model, @ModelAttribute("product")Product product) {
		Product products = mainServe.findOneProduct(id);
		List<Category> cate = mainServe.catAddNull(products);
		model.addAttribute("cate", cate);
		model.addAttribute("product", products);
		return "showProduct.jsp";
	}
	@PostMapping("/product/{id}")
	public String addCategory(@RequestParam("categories")Long catId, @PathVariable("id")Long prodId) {
		Product thisProd = mainServe.findOneProduct(prodId);
		Category thisCat = mainServe.findOneCategory(catId);
		mainServe.addCategoryToProduct(thisProd, thisCat);
		return "redirect:/";
	}
	@GetMapping("category/{id}")
	public String showCat(@PathVariable("id") Long id, Model model, @ModelAttribute("category")Category category) {
		Category categories = mainServe.findOneCategory(id);
		List<Product> products = mainServe.onlyAddIfNotUsed(categories);
		model.addAttribute("product", products);
		model.addAttribute("category", categories);
		return "showCat.jsp";
	}
	@PostMapping("/category/{id}")
	public String addProduct(@RequestParam("products")Long prodId, @PathVariable("id")Long catId) {
		Product thisProd = mainServe.findOneProduct(prodId);
		Category thisCat = mainServe.findOneCategory(catId);
		mainServe.addProductToCategory(thisCat, thisProd);
		return "redirect:/";
	}
}
//products/" + prodId;
