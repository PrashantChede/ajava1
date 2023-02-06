package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
