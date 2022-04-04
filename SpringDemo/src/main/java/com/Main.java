package com;

//A reference this points to another spring bean.
//a value is a true value being inputted. E.g. "sharon" or "1"
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.showMessage();
    }
}