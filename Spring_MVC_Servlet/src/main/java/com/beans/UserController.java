package com.beans;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends AbstractController {

    public  UserController(){
        setApplicationContext(UserCommand.class);
    }
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        UserCommand command = (UserCommand) arg;
        return null;
    }
}
