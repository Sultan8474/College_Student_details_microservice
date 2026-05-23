package com.api.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.main.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	

}
