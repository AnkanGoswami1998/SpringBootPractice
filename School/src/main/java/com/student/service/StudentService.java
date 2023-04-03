package com.student.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.student.entity.Student;

@Component
public interface StudentService {

	
	List<Student> getAll();
	Student addStudent(Student student);
	Student getStudentById(int id);
	String delStudent(int id);
	Student updateStudent(int id,Student student);
}
