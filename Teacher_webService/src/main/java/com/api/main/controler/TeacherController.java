package com.api.main.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.main.exception.ResourceNotFountException;
import com.api.main.model.Teacher;
import com.api.main.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController 
{
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("")
	public ResponseEntity<String> registerTeacger(@RequestBody Teacher teacher)
	{
		String res=teacherService.registerTeacher(teacher);
		
		return ResponseEntity.ok(res);
		
	}
	
	@GetMapping("")
	public ResponseEntity<List<Teacher>> gettAllTeacher()
	{
		List<Teacher> list=teacherService.gettAllTeacher();
		
		if(list != null)
		{
			return new ResponseEntity<List<Teacher>>(list,HttpStatus.FOUND);
		}
		else
		{
			throw new ResourceNotFountException("there is no record about teacher");
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Teacher> getTeacherByid(@PathVariable String id)
	{
		Teacher teacher=teacherService.getTeacherById(id);
		
		if(teacher != null)
		{
			return ResponseEntity.ok(teacher);
		}
		else
		{
			throw new ResourceNotFountException("there is no record about teacher");
		}
		
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateTeacher(@PathVariable String id, @RequestBody Teacher newteacher)
	{
		String res=teacherService.updateTeacher(id,newteacher);
		if(res != null)
		{
			return ResponseEntity.ok(res);
		}
		else
		{
			throw new ResourceNotFountException("there is no record about teacher");
		}
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> daleteTeacher(@PathVariable String id)
	{
		String res=teacherService.deleteTracher(id);
		
			return ResponseEntity.ok(res);
		
		
		
	}
	
	@GetMapping("/Course/{course}")
	public ResponseEntity <List<Teacher>> getTeacherByCourse(@PathVariable String course)
	{
		List<Teacher> res=teacherService.getTeacherByCourse(course);
		
		
		
		if(res != null)
		{
			return ResponseEntity.ok(res);
		}
		else
		{
			throw new ResourceNotFountException("there is no record about teacher With coursse");
		}
		
	}
	
	
	

}
