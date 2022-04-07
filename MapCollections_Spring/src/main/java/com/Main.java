package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        DID singer = (DID) applicationContext.getBean(DID.class);
        //System.out.println(applicationContext.containsBean("singer"));
        singer.display();
    }
}
