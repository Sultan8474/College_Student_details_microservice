package com.api.main.mogel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "COLLEGE_DETAILS")
@Data
public class College 
{
	@Id
	@Column
	private String collegeId;
	@Column
	private String collegeName;
	@Column
	private String course;
	
	@Column()
	private String addr;
	

}
