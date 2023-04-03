package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return studentService.getAll();
		
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStu(@PathVariable int id,@RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.delStudent(id);
	}
	
}
