package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle = (Triangle) applicationContext.getBean(Triangle.class);
        System.out.println(triangle);
        triangle.area();
    }
}
