package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ApplicationContext is IoC and Dependency injection is spring.xml
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.showMessage();
    }
}
