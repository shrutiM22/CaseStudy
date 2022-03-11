package com.client;

import com.entities.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student(101,"sahil",12,"football");
		service.addStudent(student);
	}
}
