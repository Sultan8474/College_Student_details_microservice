package com.api.main.services;

import java.util.List;

import com.api.main.model.Teacher;

public interface TeacherService
{
	public String registerTeacher(Teacher teacher);
	public List<Teacher> gettAllTeacher();
	
	
	
	public Teacher getTeacherById(String id);
	
	public String updateTeacher(String id,Teacher teacher);
	public String deleteTracher(String id);
	
	public List<Teacher> getTeacherByCourse(String course);

}
