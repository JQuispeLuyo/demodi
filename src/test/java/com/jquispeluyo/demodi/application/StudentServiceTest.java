package com.jquispeluyo.demodi.application;

import com.jquispeluyo.demodi.domain.Student;
import com.jquispeluyo.demodi.infraestructure.StudentDbTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

   @Test
   void saveStudent() {
      StudentDbTest studentDbTest = new StudentDbTest();
      StudentService studentService = new StudentService(studentDbTest);

      Student student = new Student();
      student.setName("name Test");
      assertEquals(studentService.saveStudent(student), expectedStudent());
   }

   private Student expectedStudent(){
      Student student = new Student();
      student.setId("1");
      student.setName("name Test");
      return student;
   }
}
