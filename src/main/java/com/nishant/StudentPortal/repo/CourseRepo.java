package com.nishant.StudentPortal.repo;

import com.nishant.StudentPortal.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
