package com.example.projetsoa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;
    public StudentController(){}
    public StudentController(StudentRepository studentRepository) {this.studentRepository = studentRepository;}

    @GetMapping(path = "/students")
    public List<Student> listBook() {
        return studentRepository.findAll();
    }


    @GetMapping(path = "/students/{id}")
    public Student student(@PathVariable Long id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping(path = "/students")
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}

