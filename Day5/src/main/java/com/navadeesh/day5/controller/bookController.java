package com.navadeesh.day5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navadeesh.day5.entity.Book;
import com.navadeesh.day5.service.bookService;

@RestController
public class bookController {
	@Autowired
    private bookService bs;

    @PostMapping("/")
    public String addBook(@RequestBody Book b){
        bs.addBook(b);
        return "Book added successfully";
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return bs.getBook(id);
    }

    @GetMapping("/")
    public List<Book> getDetails(){
        return bs.getDetails();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book b){
        return bs.updateBook(b);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        bs.deleteBook(id);
        return "Book deleted successfully";
    }

}
