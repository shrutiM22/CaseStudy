package com.dao;

import javax.persistence.EntityManager;

import com.entities.Student;
public class StudentDAOImpl implements StudentDAO {

	private EntityManager entityManager;
	public StudentDAOImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public void deleteStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}
