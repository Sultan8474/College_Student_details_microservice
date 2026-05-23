package com.api.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.main.custom_exception.ResourceNotFountException;
import com.api.main.model.Student;
import com.api.main.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping("")
	public ResponseEntity<String> registerStudent(@RequestBody Student student)
	{
		String msg=studentService.registerStudent(student);
		
		//return new  ResponseEntity<String>(msg,HttpStatus.CREATED);
		
		return ResponseEntity.ok(msg);
	}
	
	
	@GetMapping("")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> list=studentService.getAllStudent();
		
		if(list !=null)
		{
			return ResponseEntity.ok(list);
		}
		else
		{
		   throw	new  ResourceNotFountException("Three is no record in Student");
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id)
	{
		Student student=studentService.getStudentByid(id);
		
		if(student != null)
		{
			return ResponseEntity.ok(student);
		}
		else
		{
		   throw	new  ResourceNotFountException("Three is no record in Student");
		}
		
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudentById( @PathVariable int id,@RequestBody Student newstudent)
	{
          String msg=  studentService.updateStudent(id, newstudent);
		
		if(msg != null)
		{
			
			return ResponseEntity.ok(msg);
		}
		else
		{
		   throw	new  ResourceNotFountException("Three is no record in Student");
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id)
	{
		  String msg=  studentService.deleteStudent(id);
			
			if(msg != null)
			{
				
				return ResponseEntity.ok(msg);
			}
			else
			{
			   throw	new  ResourceNotFountException("Three is no record in Student");
			}
			
	}

}
