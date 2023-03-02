package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
	@Id
	@Column(name="Id")
	private int id;
	@Column(name="studentName")
	private String stuname;
	@Column(name="departmentName")
	private String deptname;
	@Column(name="mailid")
	private String mailid;
	public Student() {} ;
	public Student(int id,String stuname,String deptname,String mailid)
	{
		super();
		this.id=id;
		this.stuname=stuname;
		this.deptname=deptname;
		this.mailid=mailid;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getstudentName()
	{
		return stuname;
	}
	public void setstudentName(String stuname)
	{
		this.stuname = stuname;
	}
	public String getdepartmentName()
	{
		return deptname;
	}
	public void setdepartmentName(String deptname)
	{
		this.deptname = deptname;
	}
	public String getmailid()
	{
		return mailid;
	}
	public void setmailid(String mailid)
	{
		this.mailid = mailid;
	}
}