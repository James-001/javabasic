package com.java.tips;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.elastic.dao")
public class ElasticJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticJobApplication.class, args);
	}
}
