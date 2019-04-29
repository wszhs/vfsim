package com.zhs.vfsim.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForePageController {
	@GetMapping(value="/")
	public String index(){
		return "redirect:register";
	}
	@GetMapping(value="/home")
	public String home(){
		return "fore/home";
	}
	@GetMapping(value="/register")
	public String register(){
		return "fore/register";
	}
	@GetMapping("/forelogout")
	public String logout( ) {
		Subject subject = SecurityUtils.getSubject();
		if(subject.isAuthenticated())
			subject.logout();
		return "redirect:home";
	}
	@GetMapping(value="/login")
	public String login(){
		return "fore/login";
	}
	@GetMapping(value="/registerSuccess")
	public String registerSuccess(){
		return "fore/registerSuccess";
	}

}