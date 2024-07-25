package com.example.LibraryManagementSystem.Services;

import com.example.LibraryManagementSystem.Entities.Student;
import com.example.LibraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
        return "The Student Entity has been saved to DB";
    }
}
