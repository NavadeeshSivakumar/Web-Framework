package com.example.demo.Service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService {
	@Autowired
	private StudentRepo stu;
	public Student addDetails(Student s)
	{
		return stu.save(s);
	}
	public List<Student>getAllDetails()
	{
//		List<Student> arr=new ArrayList<>();
//		arr=stu.findAll();
//		return arr;
		return stu.findAll();
	}
	public Student changeDetails(int id,Student s)
	{
		Student ss=stu.findById(id).orElse(null);
		
		ss.setstudentName(s.getstudentName());
		ss.setdepartmentName(s.getdepartmentName());
		ss.setmailid(s.getmailid());
		return stu.save(ss);
	}
	public void deleteDepartmentById(int id)
	{
		stu.deleteById(id);
	}
}
