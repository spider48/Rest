package com.example.restspring.Controller;

import com.example.restspring.Model.Student;
import com.example.restspring.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudentApi(@RequestBody Student student){
        return studentService.saveStudent(student);

    }
    @PostMapping("/saveStudents")
    public List<Student> saveStudentApi(@RequestBody List<Student> students){
        return studentService.saveStudent(students);
    }
    @GetMapping("/findAll")
    public List<Student> findAllStudentApi(){
        return studentService.getStudents();
    }
    @GetMapping("findById/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteStudentById(@PathVariable int id){
       return studentService.deleteStudentById(id);
    }
    @GetMapping("findStudentByName/{studentName}")
    public List<Student> findStudentByName(@PathVariable String studentName){
        return studentService.findStudentByListName(studentName);

    }



}
