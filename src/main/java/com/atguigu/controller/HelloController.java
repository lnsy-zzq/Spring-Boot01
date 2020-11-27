package com.atguigu.controller;

import com.atguigu.bean.DataSourceProperties;
import com.atguigu.bean.DataSourceProperties2;
import com.atguigu.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Autowired
    private DataSourceProperties2 dataSourceProperties2;


    @Autowired
    private JdbcProperties jdbcProperties;

    @Resource
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String hello(){
//        System.out.println(dataSourceProperties);
//        System.out.println("----------"+dataSourceProperties2);
//        System.out.println("************ " + jdbcProperties);
        System.out.println(dataSource);
        return "hello mySpringBoot!";
    }
}
