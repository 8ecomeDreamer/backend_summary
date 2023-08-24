package com.example.springioc.service.impl;

import com.example.springioc.dao.BookDao;
import com.example.springioc.dao.impl.BookDaoImpl;
import com.example.springioc.service.BookServie;

public class BookServiceImpl implements BookServie {
    private BookDaoImpl BookDaoImpl = new BookDaoImpl();
    public void save(){
        System.out.println("book service save ...");
        BookDaoImpl.save();
    }
}
