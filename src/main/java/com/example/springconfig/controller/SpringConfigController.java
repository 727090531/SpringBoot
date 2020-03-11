package com.example.springconfig.controller;

import com.example.springconfig.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringConfigController {
    @Autowired
    private Book book;
    @GetMapping("/hello")
    public String hello(){
        return "hello https";
    }
    @GetMapping("/book")
    public String getBook(){
        return book.toString();
    }

}
