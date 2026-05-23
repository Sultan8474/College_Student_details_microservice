package com.api.main.model;

import java.util.ArrayList;

import java.util.List;


import com.api.main.teacher.Teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_DETAILS")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String branch;
	@Column
	private String course;
	
	@Transient
	private List<Teacher> teacher=new ArrayList<Teacher>();
	
	

}
