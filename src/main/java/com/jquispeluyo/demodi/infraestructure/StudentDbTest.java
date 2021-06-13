package com.jquispeluyo.demodi.infraestructure;

import com.jquispeluyo.demodi.domain.Student;
import com.jquispeluyo.demodi.domain.StudentRepository;

public class StudentDbTest implements StudentRepository {
   //Connect H2
   @Override
   public Student save(Student student) {
      Student studentResult = new Student ();
      studentResult.setId("1");
      studentResult.setName("name Test");
      return studentResult;
   }
}
