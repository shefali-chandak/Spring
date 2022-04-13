package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	HardDisk hardDisk;
	public void show() {
		System.out.println("This is a laptop class");
		System.out.println("HardDisk details are from class hitachi ==>" + hardDisk.details());
	}
}
