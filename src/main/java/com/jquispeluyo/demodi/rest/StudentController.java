package com.jquispeluyo.demodi.rest;

import com.jquispeluyo.demodi.application.StudentService;
import com.jquispeluyo.demodi.domain.Student;
import com.jquispeluyo.demodi.domain.StudentRepository;
import com.jquispeluyo.demodi.infraestructure.StudentDbTest;
import com.jquispeluyo.demodi.infraestructure.StudentMysql;
import com.jquispeluyo.demodi.infraestructure.StudentOracle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

   // Oracle
   // StudentRepository studentRepository = new StudentOracle();

   //Mysql
   StudentRepository studentRepository = new StudentMysql();

   StudentService studentService = new StudentService(studentRepository);

   @PostMapping
   public Student saveStudent(){
     Student student = new Student();
     student.setName("name");
     return studentService.saveStudent(student);
   }

}
