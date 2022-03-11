package com.service;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.entities.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO daoOBJ;
	public StudentServiceImpl() {
		daoOBJ = new StudentDAOImpl();
	}
	@Override
	public void addStudent(Student student) {
		daoOBJ.beginTransaction();
		daoOBJ.addStudent(student);
		daoOBJ.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		daoOBJ.beginTransaction();
		daoOBJ.updateStudent(student);
		daoOBJ.commitTransaction();
	}

	@Override
	public void deleteStudent(Student student) {
		daoOBJ.beginTransaction();
		daoOBJ.deleteStudent(student);
		daoOBJ.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) {
		//data fetch
		Student student = daoOBJ.getStudentById(id);
		return student;
	}
	
}
