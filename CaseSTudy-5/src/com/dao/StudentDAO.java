package com.dao;

import com.entities.Student;

public interface StudentDAO {
	Student getStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Student student);
	void commitTransaction();
	void beginTransaction();
	
}
