package com.example.LibraryManagementSystem.Controllers;

import com.example.LibraryManagementSystem.Entities.Student;
import com.example.LibraryManagementSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//endPoints are written here
@RequestMapping("/student")//all endPoints will have student as prefix
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        String res = studentService.addStudent(student);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
