package com.example.restspring.StudentRepository;

import com.example.restspring.Model.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student, Integer>{

 Student findStudentBystudentName(String studentName); //returns single

 List<Student> findStudentByListStudentName(String studentName);
}
