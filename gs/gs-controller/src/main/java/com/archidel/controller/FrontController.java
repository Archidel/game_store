package com.archidel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.archidel.gs.bean.User;
import com.archidel.service.UserService;

@Controller
public class FrontController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value= "/users", method = RequestMethod.GET)
    public String homePage(ModelMap model) {
	List<User> list = userService.getUserList();
	model.addAttribute("users", list);
	return "users_page";
    }
}
