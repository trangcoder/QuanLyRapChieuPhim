package vn.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.java.context.ApplicationUserContext;

@Controller
public class HelloController {

	@RequestMapping("")
	public String hello(Model model) {
		model.addAttribute("loggedin", ApplicationUserContext.getLoggedinUser());
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
