package com.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class restfulOperate {
//    增
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }
//    删
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }
//    改
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..." + user);
        return "{'module': 'user update'}";
    }
//    查
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id){
        System.out.println("get user id:" + id);
        return "{'module': 'user getId'}";
    }
}
