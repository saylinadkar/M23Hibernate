package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Student;

public class StudentServiceImpl  implements StudentService
{
private StudentDao dao;

	public StudentServiceImpl() {
	super();
   dao=new StudentDaoImpl();
}

	
   @Override
	public void addStudent(Student s) 
   {
	dao.beginTransiction();
	dao.addStudent(s);
	dao.commitTransiction();
			}

	@Override
	public void updateStudent(Student s) {
		dao.beginTransiction();
		dao.updateStudent(s);
		dao.commitTransiction();
		
	}

	@Override
	public void deleteStudent(Student s) {
		dao.beginTransiction();
		dao.deleteStudent(s);
		dao.commitTransiction();
		
		
	}

	@Override
	public Student getStudentById(int rollno) {
		Student s=dao.getStudentById(rollno);
		return s;
	}
	
	

}
