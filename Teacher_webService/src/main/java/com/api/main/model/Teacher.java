package com.api.main.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TEACHER_DETAILS")
@Data
public class Teacher
{
	@Id
	
	@Column
	private String id;
	@Column
	private String name;
	@Column
	private String course;
	@Column
	private String collegeId;
	
	/*
	 * @Transient private List<College> college=new ArrayList<College>();
	 */
	 
	

}
