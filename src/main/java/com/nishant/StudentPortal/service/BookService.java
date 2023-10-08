package com.nishant.StudentPortal.service;

import com.nishant.StudentPortal.model.Book;
import com.nishant.StudentPortal.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    BookRepo repo;

    public Book addBook(Book book) {
        return repo.save(book);
    }


    public List<Book> getAll() {
        return repo.findAll();
    }

    public String deleteBook(Integer id) {
        repo.deleteById(id);
        return "Book at "+ id +" deleted successfully";
    }
}
