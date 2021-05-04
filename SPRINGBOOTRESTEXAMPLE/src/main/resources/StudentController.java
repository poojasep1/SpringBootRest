package com.niit.SPRINGBOOTRESTEXAMPLE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("students")
	public List<Student> getStudents(){

		return studentService.getStudents();
}
}