package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//声明当前应用为Spring应用方
/*
* @SpringBootConfiguration 等价于@configuration
@EnableAutoConfiguration 启动自动配置，框架底层提供了大量的配置类，框架根据项目运行环境来决定哪些配置生效
@ComponentScan 默认扫描主程序所在的包以及子包
* */
/*
* 启动服务器时，SpringApplication构造器，执行初始化操作，
* 加载类路径中META-INF/spring-factories文件。扫描所有的jar包
*
*
* */



public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }
}
