package com.archidel.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.archidel.gs.bean.User;
import com.archidel.service.UserService;

@Controller
@ComponentScan({ "com.archidel.main" })
public class StartApp {

    public static void main(String[] args) {
	A a = new A();
	a.execute();
    }

}

@Component
class A {
    @Autowired
    private UserService userService;

    public void execute() {
	User user = userService.findById(1);
	System.out.println(user.toString());
    }

}
