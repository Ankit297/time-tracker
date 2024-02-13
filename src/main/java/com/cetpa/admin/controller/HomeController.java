package com.cetpa.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class HomeController 
{
	
	@RequestMapping("/")
    public String getHomeview(HttpSession session)
    {
    	if(session.getAttribute("user")==null) {
    		
    		return "admin/login";
    	}
    		return"admin/home";
    	
    }
}
