package com.api.main.services;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.api.main.model.Teacher;
import com.api.main.repositories.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService
{
	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private RestTemplate template;

	@Override
	public String registerTeacher(Teacher teacher) 
	{
		String id=teacherRepo.save(teacher).getId();
		return "1 teacher is registred Successfull with id: "+id;
	}

	@Override
	public List<Teacher> gettAllTeacher() 
	{
		List<Teacher> list=teacherRepo.findAll();
		if(list != null)
		{
			return list;
		}
		return null;
	}

	@Override
	public Teacher getTeacherById(String id) 
	{
	
		
		
		  Teacher teacher=teacherRepo.findById(id).orElseThrow(() -> new
		  RuntimeException("College not found"));
		  
		/* * College college=null; try { String collegeId=teacher.getCollegeId();
		 * college=template.getForObject("http://COLLEGE-SERVICE/college/"+collegeId,
		 * College.class); } catch(Exception e) {
		 * System.out.println("college Api error"); e.printStackTrace(); }
		 * 
		 * if (college != null) { teacher.setCollege(List.of(college)); } else {
		 * teacher.setCollege(new ArrayList<>()); }
		 * 
		 * return teacher;
		 */
		  
		  if(teacher != null)
		  {
			  return teacher;
		  }
		  else
		  {
			  return null;
		  }
		  
	}

	@Override
	public String updateTeacher(String id, Teacher teacher) 
	{
		Teacher validTeacher=teacherRepo.findById(id).orElseThrow();
		
		if(validTeacher != null)
		{
			teacherRepo.save(teacher);
			return "id no "+id+" teacher is updated Successfully  ";
		}
		
		return null;
	}

	@Override
	public String deleteTracher(String id) 
	{
		Teacher validTeacher=teacherRepo.findById(id).orElseThrow();
	if(validTeacher != null)
	{
		teacherRepo.delete(validTeacher);
		return "id no "+id+" teacher is deleted Successfully  ";
	}
		
		return null;
	}

	@Override
	public List<Teacher> getTeacherByCourse(String course) 
	{
		
		List<Teacher> list=teacherRepo.findByCourse(course);
		
		if(list != null)
		{
			return list;
		}
		else
		{
			return null;
		}
	
		
	}
	
	

}
