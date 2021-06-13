package com.jquispeluyo.demodi.application;

import com.jquispeluyo.demodi.domain.StudentRepository;
import com.jquispeluyo.demodi.domain.Student;

public class StudentService {

   StudentRepository studentRepository;

   public StudentService(StudentRepository studentRepository) {
      this.studentRepository = studentRepository;
   }

   public Student saveStudent(Student student){
      return studentRepository.save(student);
   }

}
