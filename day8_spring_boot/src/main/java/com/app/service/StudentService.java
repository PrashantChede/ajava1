package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student std);
}
