package com.edmeadeJohanan.mvc1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/books")
	public String main(Model model){
		List<Book>books = bService.getAllBooks();
		model.addAttribute("books", books);
		return "main.jsp";
	}
	@GetMapping("/books/{id}")
	public String getBook(@PathVariable("id")Long id, Model model){
		Book oneB = bService.getOneBook(id); 
		model.addAttribute("oneB", oneB);
		return "book.jsp";
	}
}
