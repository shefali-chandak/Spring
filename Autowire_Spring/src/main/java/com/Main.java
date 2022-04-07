package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("byType.xml");
        Student singer = (Student) applicationContext.getBean("student");
        Student singer1 = (Student) applicationContext.getBean("stud1");
        System.out.println(singer);
        System.out.println(singer1);*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Employee singer = (Employee) applicationContext.getBean("employee");
        Student singer1 = (Student) applicationContext.getBean("student");
        System.out.println(singer);
        System.out.println(singer1);
    }
}
