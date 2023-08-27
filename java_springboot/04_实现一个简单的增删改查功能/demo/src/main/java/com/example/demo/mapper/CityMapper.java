package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.City;

@Mapper
public interface CityMapper extends BaseMapper <City> {
    //1.通过id查询城市信息
    City getCity(int id);
    //2.通过id删除城市信息
    int deleteCity(int id);
    //3.更改城市信息
    int updateCity(City city);
    //4.插入城市信息
    int saveCity(City city);
}
