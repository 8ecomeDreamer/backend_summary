//xml版获取bean对象
package com.example.springioc;

import com.example.springioc.dao.impl.BookDaoImpl;
import com.example.springioc.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocApplication2 {
    public static void main(String[] args) {
        //    3.获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//    4.获取bean  参数为xml的id
        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("BookDaoImpl");
        bookDao.save();

        BookServiceImpl bookService =  (BookServiceImpl) ctx.getBean("BookServiceImpl");
        bookService.save();
    }

}
