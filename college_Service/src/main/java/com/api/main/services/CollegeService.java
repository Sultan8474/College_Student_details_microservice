package com.api.main.services;

import java.util.List;

import com.api.main.mogel.College;

public interface CollegeService 
{
	public String registerCollege(College college);
	
	public List<College> gettAllCollege();
	
	public College getCollegeById(String id);
	
	public String updateCollege(String id,College college);
	
	public String deleteCollege(String id);

}
