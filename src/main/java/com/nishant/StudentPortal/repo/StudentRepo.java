package com.nishant.StudentPortal.repo;

import com.nishant.StudentPortal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
}
