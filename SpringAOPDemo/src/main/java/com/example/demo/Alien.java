package com.example.demo;

import org.springframework.stereotype.Component;

//When want to make a class as Spring Bean
@Component
public class Alien {
    public void show(){

        //log -> before execution starts
        //security code -> like login verification
        //transactions -> start it related to db

        /*
        Above 3 may be compulsory and have to write in 15 methods supppose so writing it repeatedly
        is not convinent so use AOP.
        AOP -> Aspect Oriented Programming ->
         */

        //15 statements -> bizlogic

        //transactions -> commit
        System.out.println("Hello World");

        //log -> after execution starts
    }
}
