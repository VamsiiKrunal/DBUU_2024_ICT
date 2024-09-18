package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.entity.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	//creating studentrepository reference to use the methods
	public StudentRepository repo;
	
	public List<Student> getAllStudents() {
		return repo.findAll();
		
	}
	public Student insertStudent(Student stuObj) {
		return repo.save(stuObj);
		
	}
	
}
