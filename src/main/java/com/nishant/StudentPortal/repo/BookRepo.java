package com.nishant.StudentPortal.repo;

import com.nishant.StudentPortal.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo  extends JpaRepository<Book,Integer> {
}
