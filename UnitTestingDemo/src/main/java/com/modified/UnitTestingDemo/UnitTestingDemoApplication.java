package com.modified.UnitTestingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.modified.UnitTestingDemo"})
public class UnitTestingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingDemoApplication.class, args);
	}

}
