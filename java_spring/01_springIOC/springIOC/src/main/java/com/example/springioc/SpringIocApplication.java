package com.example.springioc;

import com.example.springioc.service.impl.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocApplication {
    public static void main(String[] args) {
        BookServiceImpl BookServiceImpl = new BookServiceImpl();
        BookServiceImpl.save();
    }
}
