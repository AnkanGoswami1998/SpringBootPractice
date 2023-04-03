package com.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public String delStudent(int id) {
		
		studentRepository.deleteById(id);
		return "id "+id+" deleted";
	}

	@Override
	public Student updateStudent(int id, Student student) {
		
		Student student2 = studentRepository.findById(id).get();
		student2.setName(student.getName());
		student2.setStandard(student.getStandard());
		student2.setSub(student.getSub());
		return studentRepository.save(student2);
	}

}
