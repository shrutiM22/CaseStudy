package com.service;

import com.entities.Student;

public interface StudentService {
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
	Student findStudentById(int id);
	
}
