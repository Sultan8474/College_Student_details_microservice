package com.api.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.main.mogel.College;
import com.api.main.repositries.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService
{
	    @Autowired
         private CollegeRepository collegeRepo;

	@Override
	public String registerCollege(College college) 
	{
		String id=collegeRepo.save(college).getCollegeId();
		
		return "1 college is registered successfully withid: "+id;
	}

	@Override
	public List<College> gettAllCollege() 
	{
		List<College> list=collegeRepo.findAll();
		
		if(list != null)
		{
			return list;
		}
		return null;
	}

	@Override
	public College getCollegeById(String id) 
	{
		College college=collegeRepo.findById(id).orElseThrow();
		if(college != null)
		{
			return college;
		}
		return null;
	}

	@Override
	public String updateCollege(String id, College newCollege) 
	{
		College validCollege=collegeRepo.findById(id).orElseThrow();
		if(validCollege != null)
		{
			collegeRepo.save(newCollege);
			return " id no: "+id+" college is updated successfully";
		}
		return null;
	}

	@Override
	public String deleteCollege(String id) 
	{
		College deleteCollege=collegeRepo.findById(id).orElseThrow();
		if(deleteCollege != null)
		{
		       collegeRepo.deleteById(id);
		       return " id no: "+id+" college is deleted successfully";  
		
		}
		
		return null;
	}

}
