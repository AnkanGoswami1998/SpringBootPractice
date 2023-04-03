package com.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Book;
import com.student.entity.Student;
import com.student.service.StudentService;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{

	@Autowired
	private StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = Student.builder().name("Ankan").sub("Math").standard("XI").build();
		Book b11 = Book.builder().bid(45).bname("Compound Interest").build();
		Book b12 = Book.builder().bid(98).bname("Time&Work").build();
		List<Book> lb1 = new ArrayList<>();
		lb1.add(b11);
		lb1.add(b12);
		s1.setBooks(lb1);
		Student s2 = Student.builder().name("Akash").sub("Biology").standard("X").build();
		Book b21 = Book.builder().bid(78).bname("Health").build();
		Book b22 = Book.builder().bid(25).bname("Botany").build();
		List<Book> lb2 = new ArrayList<>();
		lb2.add(b21);
		lb2.add(b22);
		s2.setBooks(lb2);
		Student s3 = Student.builder().name("Aditi").sub("History").standard("VI").build();
		Book b31 = Book.builder().bid(68).bname("1947").build();
		Book b32 = Book.builder().bid(14).bname("Sipahi Bidroho").build();
		List<Book> lb3 = new ArrayList<>();
		lb3.add(b31);
		lb3.add(b32);
		s3.setBooks(lb3);
		
		studentService.addStudent(s1);
		studentService.addStudent(s2);
		studentService.addStudent(s3);
		
		System.out.println("Object Saved");
		
	}

}
