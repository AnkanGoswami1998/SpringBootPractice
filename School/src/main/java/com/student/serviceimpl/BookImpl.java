package com.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Book;
import com.student.repository.BookRepository;
import com.student.service.BookService;
@Service
public class BookImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public Book getById(int bid) {
		
		return bookRepository.findById(bid).get();
	}

	@Override
	public String delBook(int bid) {
		bookRepository.deleteById(bid);
		return "id "+bid+" is deleted";
	}

}
