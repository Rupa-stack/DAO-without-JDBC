package com.cts.dao.business;

import com.cts.dao.model.Student;
import com.cts.dao.service.StudentDao;
import com.cts.dao.service.StudentDaoImpl;

public class DaoTest {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
	//get all students	
	 for(Student student : studentDao.getAllStudents())
	 {
		 System.out.println(student.getId());
		 System.out.println(student.getName());
		 System.out.println(student.getTechnology());
	 }
	 
	 //update student
	 Student student = studentDao.getAllStudents().get(0);
	 student.setName("Michael");
	 
	 //get the student
	 
	studentDao.getStudent(0);
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getTechnology());
	 
	
	//delete
	studentDao.deleteStudent(student);
	}

}
