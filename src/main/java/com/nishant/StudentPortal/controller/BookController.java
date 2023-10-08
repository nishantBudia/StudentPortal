package com.nishant.StudentPortal.controller;


import com.nishant.StudentPortal.model.Asset;
import com.nishant.StudentPortal.model.Book;
import com.nishant.StudentPortal.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("books")
public class BookController {
    @Autowired
    BookService service;

    /*
    POST
     */

    @PostMapping()
    public Book addBook(@RequestBody @Valid Book book){
        return service.addBook(book);
    }

    /*
    GET
     */

    @GetMapping
    public List<Book> getAll(){
        return service.getAll();
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteBook(@PathVariable Integer id){
        return service.deleteBook(id);
    }
}
