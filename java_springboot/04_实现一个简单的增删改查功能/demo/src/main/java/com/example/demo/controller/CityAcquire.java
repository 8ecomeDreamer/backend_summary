package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityAcquire {

    @RequestMapping("/getCity")
    public void getCityList(){
    }

    @RequestMapping("/addCity")
    public void addCityList(){
    }

    @RequestMapping("/changeCity")
    public void changeCityList(){
    }

    @RequestMapping("/selectCity")
    public void selectCityList(){
    }
}
