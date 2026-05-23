package com.api.main.services;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.main.model.Student;
import com.api.main.repositories.StudentRepository;
import com.api.main.teacher.College;
import com.api.main.teacher.Teacher;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private RestTemplate template;

	@Override
	public String registerStudent(Student student) {
		int id = studentRepo.save(student).getId();

		return 1 + " Student is registerd successfull with id: " + id;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = studentRepo.findAll();

		if (list != null) {
			return list;
		} else {
			return null;
		}

	}

	@Override
	public Student getStudentByid(int id) 
	{
		
		
		 Student student = studentRepo.findById(id)
		            .orElseThrow(() -> new RuntimeException("Student not found"));

		   
		

		    try {
		    	// Get course from student
		    	String course=student.getCourse();	
		    	
		    	// Get teachers by course
		    	 Teacher[]   teachers = template.getForObject(
		            "http://TEACHER-SERVICE/teacher/Course/"+course,
		            Teacher[].class
		        );
		     
		     
		     
		     
		    List<Teacher> teacherList= Arrays.asList(teachers);
		   
		    // For each teacher get college
		    for(Teacher teacher : teacherList)
		    {
		    	
		     try
		     {
		    	 
		    	String collegeId= teacher.getCollegeId();
		    	
		    	 // Call college service
		    	College college = template.getForObject(
		    		    "http://COLLEGE-SERVICE/college/"+collegeId,
		    		    College.class
		    		);
		    

		    if (college != null) 
		    {
		    	 teacher.setCollege(List.of(college));
		    } 
		    else
		    {
		    	teacher.setCollege(new ArrayList<>());
		    }

	 }// end of nested try
		     
		    catch (Exception e)
		    {
		        System.out.println("Teacher API error: " + e.getMessage());
		        e.printStackTrace();
		    }
 } //end or for each loop
		    
		    // Set teacher list into student
		    student.setTeacher(teacherList);
		    
		    } // end of outer try
		    
	catch(Exception e)
	{
		e.printStackTrace();
		 student.setTeacher(new ArrayList<>());
	}
	      
	
	
		    return student;

	}  // end method
	
	

	@Override
	public String updateStudent(int id, Student newStudent) {

		Student student = studentRepo.findById(id).orElseThrow();
		if (student != null) {
			studentRepo.save(newStudent);

			return "id no. " + id + ", row is Updated sucessfully";
		} else
			return null;

	}

	@Override
	public String deleteStudent(int id) {
		Student student = studentRepo.findById(id).orElseThrow();
		if (student != null) {
			studentRepo.delete(student);

			return "id no. " + id + ", row is deleted sucessfully";
		} else
			return null;
	}

}
