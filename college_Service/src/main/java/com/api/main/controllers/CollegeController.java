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

import com.api.main.exception.ResourceNotFoundException;
import com.api.main.mogel.College;
import com.api.main.services.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController 
{
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("")
	public ResponseEntity<String> collegeRegisterd(@RequestBody College college)
	{
		String res=collegeService.registerCollege(college);
	return ResponseEntity.ok(res);
		
		
	}
	@GetMapping("")
	public ResponseEntity<List<College>> getAllCollege()
	{
		List<College> list=collegeService.gettAllCollege();
		if(list != null)
		{	
			return ResponseEntity.ok(list);
			
		}
		else
		{
			throw new ResourceNotFoundException("there is no college");
		}

		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<College> getOneCollege(@PathVariable String id)
	{
		College college=collegeService.getCollegeById(id);
		
	if(college != null)
	{
		
		return ResponseEntity.ok(college);
		
	}
	else
	{
		throw new ResourceNotFoundException("there is no college");
	}

		
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateCollege(@RequestBody College college,@PathVariable String id)
	{
		String res=collegeService.updateCollege(id, college);
		
	
		if(res != null)
		{
			
			return ResponseEntity.ok(res);
			
		}
		else
		{
			throw new ResourceNotFoundException("there is no college");
		}

			
		
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCollege(@PathVariable String id)
	{
		String res=collegeService.deleteCollege(id);
		
	
		if(res != null)
		{
			
			return ResponseEntity.ok(res);
			
		}
		else
		{
			throw new ResourceNotFoundException("there is no college");
		}

			
		
		
	}
	
	

}
