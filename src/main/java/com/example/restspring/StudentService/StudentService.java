package com.example.restspring.StudentService;

import com.example.restspring.Model.Student;
import com.example.restspring.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
       return studentRepository.save(student);
    }
    public List<Student> saveStudent(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student findStudentById(int id){//find Id ApI
        return studentRepository.findById(id).orElse(null);
    }

    public String deleteStudentById(int id){ //delete ID API
        studentRepository.deleteById(id);
        return "student deleted:" + id;
    }

//    public Student findStudentByName(String studentName){
//        return studentRepository.findStudentBystudentName(studentName);
//    }

    public List<Student> findStudentByListName(String studentName){
        return studentRepository.findStudentByListStudentName(studentName);
    }




}
