package com.example.demo;

//responsible to maintain log

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
Cross-cutting concerns -> keep in aspect

Advice -> when can show what should be called i.e log() so use advice for that.
Pointcut -> when where to be called
 */

@Component
@Aspect
public class Helper {
    @Before("execution( public void show())")
    public void log(){
        System.out.println("before show is called");
    }

    @After("execution( public void show())")
    public void logAfter(){
        System.out.println("after show is called");
    }
}
