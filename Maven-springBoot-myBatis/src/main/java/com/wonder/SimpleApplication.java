package com.wonder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class SimpleApplication{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
