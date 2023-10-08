package com.nishant.StudentPortal.controller;


import com.nishant.StudentPortal.model.Course;
import com.nishant.StudentPortal.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("courses")
public class CourseController {

    @Autowired
    CourseService service;

    /*
    POST
     */

    @PostMapping()
    public Course addCourse(@RequestBody @Valid Course course){
        return service.addCourse(course);
    }

    /*
    GET
     */

    @GetMapping
    public List<Course> getAll(){
        return service.getAll();
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteCourse(@PathVariable Integer id){
        return service.deleteCourse(id);
    }
}
