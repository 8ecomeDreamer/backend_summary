package com.example.springioc.dao.impl;

import com.example.springioc.dao.BookDao;

public class BookDaoImpl  implements BookDao {
    public void save(){
        System.out.println("book dao save ...");
    }
}
