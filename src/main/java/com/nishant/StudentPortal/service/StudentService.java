package com.nishant.StudentPortal.service;


import com.nishant.StudentPortal.model.Student;
import com.nishant.StudentPortal.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }


    public List<Student> getAll() {
        return repo.findAll();
    }

    public String deleteStudent(String id) {
        repo.deleteById(id);
        return "Student at "+ id +" deleted successfully";
    }
}
