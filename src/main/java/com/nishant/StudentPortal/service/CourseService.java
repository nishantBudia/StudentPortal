package com.nishant.StudentPortal.service;


import com.nishant.StudentPortal.model.Course;
import com.nishant.StudentPortal.model.Course;
import com.nishant.StudentPortal.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo repo;

    public Course addCourse(Course course) {
        return repo.save(course);
    }


    public List<Course> getAll() {
        return repo.findAll();
    }

    public String deleteCourse(Integer id) {
        repo.deleteById(id);
        return "Course at "+ id +" deleted successfully";
    }
}
