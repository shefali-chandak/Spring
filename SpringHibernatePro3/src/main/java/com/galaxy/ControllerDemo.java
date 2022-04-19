package com.galaxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import model.Employee;
import model.EmployeeDao;

@Controller
public class ControllerDemo {

	private ApplicationContext conn;
	
	@RequestMapping("/home")
	public String view1() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String view2(Model m) {
		conn =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp =conn.getBean("info",Employee.class);
		m.addAttribute("bean",emp);
		return "register";
 }
	
	@RequestMapping("/store")
	public String view3(@ModelAttribute("bean") Employee e,Model m) {
		conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeDao obj = conn.getBean("dao",EmployeeDao.class);
		obj.saveData(e);
		m.addAttribute("msg","Record inserted successfully");
		return "register";
		
	}
	
}