package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	//creating service reference to use getallstudents method
	public StudentService service;
	
	@GetMapping("/getallstudents")
	public List<Student> getStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/insertStudent")
	public Student insertStudent(@RequestBody Student stobj) {
		return service.insertStudent(stobj);
		
	}
	
}
