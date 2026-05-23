package com.api.main.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.main.mogel.College;

public interface CollegeRepository extends JpaRepository<College, String>
{

	

}
