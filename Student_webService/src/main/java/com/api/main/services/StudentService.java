package com.api.main.services;

import java.util.List;

import com.api.main.model.Student;

public interface StudentService
{
	public String registerStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentByid( int id);
	
	public String updateStudent( int id, Student newStudent);
	
	public String deleteStudent( int id);
	
	

}
