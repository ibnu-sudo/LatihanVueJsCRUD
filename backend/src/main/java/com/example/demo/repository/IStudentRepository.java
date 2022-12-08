package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.impl.Student;

public interface IStudentRepository {

	Student insertStudent(Student student);

	List<Student> getAllStudent();
	Student updateStudent(int id, Student student);

	Student deleteStudent(int id);

	Student getStudent(int id);
	

}
