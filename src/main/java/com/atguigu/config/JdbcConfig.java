package com.atguigu.config;


import com.atguigu.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties3 datasource(){
        return new DataSourceProperties3();
    }
}
