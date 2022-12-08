package com.example.demo.service;

import java.util.List;

import com.example.demo.model.impl.Student;


public interface IStudentService {

	Student insertStudent(Student student);

	List<Student> getAllStudent();

	Student updateStudent(int id, Student student);

	Student deleteStudent(int id);

	Student getStudent(int id);

}
