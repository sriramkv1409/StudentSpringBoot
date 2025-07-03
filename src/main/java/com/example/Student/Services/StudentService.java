package com.example.Student.Services;

import com.example.Student.Models.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<StudentModel> student =new ArrayList<>(List.of(
        new StudentModel(1,"Sriram",20),
        new StudentModel(2,"Sanjith",19)
    ));

    public void addStudent(StudentModel s){
        student.add(s);
    }

    public List getAllStudents(){
        return student;
    }

}
