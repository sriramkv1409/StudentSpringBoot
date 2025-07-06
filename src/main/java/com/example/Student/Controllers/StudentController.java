package com.example.Student.Controllers;

import com.example.Student.Models.StudentModel;
import com.example.Student.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
  //Service Layer
    @Autowired
    StudentService ss;

    @PostMapping
    public String addStudent(@RequestBody StudentModel s){
        ss.addStudent(s);
        return "Student Added Successfully";
    }


    @GetMapping
    public List<StudentModel> getStudents(){
        return ss.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudentById(@PathVariable int id){
        return ss.getStudentById(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@RequestBody StudentModel s){
        return ss.updateStudent(s);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return ss.deleteStudentById(id);
    }

}
