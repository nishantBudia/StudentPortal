package com.nishant.StudentPortal.controller;


import com.nishant.StudentPortal.model.Student;
import com.nishant.StudentPortal.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService service;

    /*
    POST
     */

    @PostMapping()
    public Student addStudent(@RequestBody @Valid Student student){
        return service.addStudent(student);
    }

    /*
    GET
     */

    @GetMapping
    public List<Student> getAll(){
        return service.getAll();
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable String id){
        return service.deleteStudent(id);
    }
}
