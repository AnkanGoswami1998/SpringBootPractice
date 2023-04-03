package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Book;
import com.student.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/book")
	public List<Book> getAll(){
		return bookService.getAllBooks();
	}
	
	@PostMapping("/book")
	public Book addBooks(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/book/{bid}")
	public Book getBookById(@PathVariable int bid) {
		return bookService.getById(bid);
	}
	
	@DeleteMapping("/book/{bid}")
	public String deleteBook(@PathVariable int bid) {
		return bookService.delBook(bid);
	}
}
