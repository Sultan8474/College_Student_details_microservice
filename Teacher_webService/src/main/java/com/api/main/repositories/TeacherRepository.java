package com.api.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.main.model.Teacher;
import java.util.List;






public interface TeacherRepository extends JpaRepository<Teacher, String>
{

 
 List< Teacher> findByCourse(String course);

}
