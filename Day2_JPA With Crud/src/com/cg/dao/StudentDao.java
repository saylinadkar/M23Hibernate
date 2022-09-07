package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	//user define method for crud operation
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);
	
	public abstract void beginTransiction();
	public abstract void commitTransiction();

}

