package com.cetpa.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/login")
public class LoginController {
	
	
	@RequestMapping("/")
	public String getloginview(HttpSession session)
    {
    	if(session.getAttribute("user")==null) {
 
    			return "redirect:/admin/";
    		}
    		return "admin/login";
    	
    }
	
	
	@RequestMapping("authenticate-user")
	public String authenticateUser(String adminid,String pass,Model model,HttpSession ses)
	{
		
		if(adminid.equals("ankit") && pass.equals("0011")) {
			
			ses.setAttribute("user","ankit");
			    return "redirect:/admin/";
		}
		    model.addAttribute("id",adminid);
		    model.addAttribute("msg","Authentication failed...");
		   return "redirect:/login";
		
		
		
		
	}
	

}
