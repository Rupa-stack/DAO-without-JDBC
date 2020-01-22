package com.cts.dao.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.dao.model.Student;

public class StudentDaoImpl implements StudentDao{
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student s1=new Student(1,"James","Java");
		Student s2=new Student(2,"Patrick","Java");
		Student s3=new Student(12,"James","Java");
		Student s4=new Student(22,"Patrick","Java");
		students.add(s1);
		students.add(s2);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int id) {
		return students.get(id);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getId()).setName(student.getName());
		students.get(student.getId()).setTechnology(student.getTechnology());
		
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getId());
		System.out.println("Student : " +student.getId()+ " deleted");
		
	}

}
