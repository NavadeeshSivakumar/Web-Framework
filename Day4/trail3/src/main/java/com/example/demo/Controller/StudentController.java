package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService stuservice;
	
	@GetMapping ("/getStudent")
	public List<Student>getDetails()
	{
		return stuservice.getAllDetails();
	}
	@PostMapping("/addStudent")
	public Student postDetails (@RequestBody Student s)
	{
		return stuservice.addDetails(s);
		
	}
	@PutMapping("/putStudent/{id}")
	public Student putDetails (@PathVariable("id") int id,@RequestBody Student s)
	{
		return stuservice.changeDetails(id,s);
	}
	
	@DeleteMapping("/del/{id}")
	public void deletedetails(@PathVariable("id") int id)
	{
		stuservice.deleteDepartmentById(id);
	}
}