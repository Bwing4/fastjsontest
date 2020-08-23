package com.sunieve.project.fasjsontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

import com.alibaba.fastjson.JSON;

@SpringBootApplication
public class FasjsontestApplication {


    public static void main(String[] args) {

        SpringApplication.run(FasjsontestApplication.class, args);
//
//        String json = "{\"@type\":\"com.sunieve.project.fasjsontest.User\", \"name\":\"zhangsan\"}";
//        Object obj = JSON.parse(json);
//        System.out.println(obj);
//        //输出: User{name='zhangsan'}

        String json = "{\"@type\":\"com.sunieve.project.fasjsontest.User\", \"name\":\"sunieve\", \"properties\":{}}";
        Object obj = JSON.parse(json);
        System.out.println(obj);
        //输出: User{name='zhangsan'}


    }

}
