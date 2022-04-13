package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.DI.Student;

@SpringBootApplication
public class SpringBootDemoFirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(SpringBootDemoFirstApplication.class, args);
		Student student = c.getBean(Student.class);
		System.out.println("**** STUDENT DETAILS ****");
		System.out.println(student);
	}

}
