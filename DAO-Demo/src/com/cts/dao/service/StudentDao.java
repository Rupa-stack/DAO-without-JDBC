package com.cts.dao.service;
import java.util.List;

import com.cts.dao.model.Student;
public interface StudentDao {
	
	public List<Student> getAllStudents();
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	

}
