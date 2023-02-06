package com.app.service;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stdRepo;
	
	@Override
	public List<Student> getAllStudents() {
		System.out.println("inside studentserviceimpl");
		return stdRepo.findAll();
	}

	@Override
	public Student saveStudent(Student std) {
		// TODO Auto-generated method stub
		return stdRepo.save(std);
	}

}
