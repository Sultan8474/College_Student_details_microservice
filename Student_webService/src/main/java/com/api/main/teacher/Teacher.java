package com.api.main.teacher;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher 
{
	private String id;
	
	private String name;

	private String course;
 
	private String collegeId;    
	
	@Transient
	private List<College> college=new ArrayList<College>();
}
