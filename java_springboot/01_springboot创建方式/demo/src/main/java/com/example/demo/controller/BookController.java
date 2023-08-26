package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ways")
public class BookController {
    @GetMapping("/idea")
    public String ideaWays(){
        System.out.println("idea联网版创建springboot项目");
        return "idea联网版创建springboot项目";
    }

    @GetMapping("/offical")
    public String officialWays(){
        System.out.println("官网版创建springboot项目");
        return "官网版创建springboot项目";
    }

    @GetMapping("/handMake")
    public  String handMakeWays(){
        System.out.println("纯手动创建springboot项目");
        return "纯手动创建springboot项目";
    }
}
