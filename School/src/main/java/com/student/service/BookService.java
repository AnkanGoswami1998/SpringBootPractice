package com.student.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.student.entity.Book;
@Component
public interface BookService {
	
	
	List<Book> getAllBooks();
	Book addBook(Book book);
	Book getById(int bid);
	String delBook(int bid);

}
