package com.example.srt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.example.srt.mapper")
@SpringBootApplication
public class ShortenerApplication {



	public static void main(String[] args) {
		
		
		SpringApplication.run(ShortenerApplication.class, args);
	}
	
}
