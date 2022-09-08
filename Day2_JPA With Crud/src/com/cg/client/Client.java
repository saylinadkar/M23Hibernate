package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		 
		StudentService service=new StudentServiceImpl();
       Student s=new Student();
   
//       //create operation 
//   s.setRollno(103);
//         s.setName("say");
//     service.addStudent(s);
//       
       
    s.setRollno(104);
      s.setName("parth");
     service.addStudent(s);
//       
       
      //retrieve data
//		s=service.getStudentById(102);
//		System.out.println("Student Roll No: "+s.getRollno());
//		System.out.println("Student Name: "+s.getName());
//		
		//update
//		s=service.getStudentById(102);
//		s.setName("amisha");
//		service.updateStudent(s);
		
//		//delete
//		s=service.getStudentById(103);
//	  service.deleteStudent(s);
//		System.out.println("Data is deleted");

	
	
	
	
	
	}

}
