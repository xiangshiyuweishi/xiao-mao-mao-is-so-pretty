package cn.communication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userController")
public class UserController {
	
	@RequestMapping("/hello")
	public String toHello() {
		
		return "hello";
	}
	
}
