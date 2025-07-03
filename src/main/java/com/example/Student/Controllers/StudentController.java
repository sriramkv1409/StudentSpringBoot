package com.example.Student.Controllers;

import com.example.Student.Models.StudentModel;
import com.example.Student.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
  //Service Layer
    @Autowired
    StudentService ss;

    @PostMapping("/")
    public String addStudent(@RequestBody StudentModel s){
        ss.addStudent(s);
        return "Student Added Successfully";
    }
    @GetMapping("/")
    public List<StudentModel> getStudents(){
        return ss.getAllStudents();
    }

}
