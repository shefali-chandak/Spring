package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Hitachi implements HardDisk {

	@Override
	public String details() {
		System.out.println("This is an implementation class");
		return "This is Hitachi class";
	}

}
