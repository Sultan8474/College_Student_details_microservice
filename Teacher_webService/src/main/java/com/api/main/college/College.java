package com.api.main.college;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class College
{
	private String collegeId;
	
	private String collegeName;
	
	private String course;
	
	private String addr;
	

}
