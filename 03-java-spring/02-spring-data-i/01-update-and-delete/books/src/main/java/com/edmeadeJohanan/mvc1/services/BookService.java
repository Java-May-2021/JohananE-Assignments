package com.edmeadeJohanan.mvc1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edmeadeJohanan.mvc1.models.Book;
import com.edmeadeJohanan.mvc1.repositores.BookRepository;

@Service
public class BookService {
//	Dependency Inject repository so service can have access to all methods in repository interface
	private BookRepository bRepo;

	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}

	public List<Book> getAllBooks(){
		return this.bRepo.findAll();  
	}

	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}

	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}

	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}

	public void bookDelete(Long id) {
		this.bRepo.deleteById(id);
	}
}
