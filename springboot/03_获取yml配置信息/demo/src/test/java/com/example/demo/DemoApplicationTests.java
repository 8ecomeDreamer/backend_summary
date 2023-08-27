package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    /**
     * 获取用户YAML配置信息
     */

    @Autowired
    private ConfigAcquire configAcquire;


    @Test
    public void getUserProperites(){
        System.out.println("获取application.yml配置文件中的信息：" );
        System.out.println("url:" + configAcquire.getUrl() );
        System.out.println("username:" + configAcquire.getUsername());
        System.out.println("password:" + configAcquire.getPassword() );

    }

}
