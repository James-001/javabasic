/*package com.example.elastic.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class BeanConfig {


    @Bean("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.log")
    public DataSource getDataSource(){
        DruidDataSource datasource = DruidDataSourceBuilder.create().build();
        return datasource;
    }
}
*/