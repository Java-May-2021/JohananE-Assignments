package com.edmeadeJohanan.mvc1.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edmeadeJohanan.mvc1.models.Book;
import com.edmeadeJohanan.mvc1.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bService;
	
	public BookController(BookService bService) {
		this.bService = bService;
	}
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book")Book book) {
		return "newBook.jsp";
	}
	@PostMapping(value="/books")
	public String create(@Valid @ModelAttribute("books")Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		}else {
			bService.createBook(book);
			return "redirect:/books";
		}
	}
	@GetMapping("/books")
	public String main(Model model){
		List<Book>books = bService.getAllBooks();
		model.addAttribute("books", books);
		return "main.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String getBook(@PathVariable("id")Long id, Model model){
		Book book = bService.getOneBook(id); 
		model.addAttribute("book", book);
		return "book.jsp";
	}
	@GetMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id")Long id, Model model) {
		Book book = bService.getOneBook(id);
		if(book != null) {
			model.addAttribute("book", book);
			return "edit.jsp";
		}else {
			return "redirect:/books";
		}
	}
	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id")Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			bService.updateBook(book);
			return "redirect:/books";
		}
	}@GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id")Long id) {
		bService.bookDelete(id);
		return "redirect:/books";
	}
}
