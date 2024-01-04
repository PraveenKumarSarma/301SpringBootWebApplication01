package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/req1")
	@ResponseBody
	public String indexPage()
	{
		return "<h1>Welcome to Spring Boot Web Application</h1>";
	}
	

}
