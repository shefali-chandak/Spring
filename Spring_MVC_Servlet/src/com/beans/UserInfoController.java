package com.beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class UserInfoController extends AbstractCommandController{
	
	public UserInfoController()
	{
        setCommandClass(UserCommand.class);
    }
   
	@Override
	protected ModelAndView handle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, BindException arg3)
			throws Exception {
		UserCommand command = (UserCommand) arg2;
		String name = command.getFullName();
		int age = command.getAge();
		
		if(age>18) {
			return new ModelAndView("Welcome","Name",name);
		}
		else {
			return new ModelAndView("Error","Name",name);
		}
	}
}
