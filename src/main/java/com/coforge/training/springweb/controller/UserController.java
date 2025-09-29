/**
 * Author : Manish.6.Verma;
 * Date : Sep 29, 2025
 * Time : 10:28:23 AM
 * Project : spring-web
 */
package com.coforge.training.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 */
@Controller
public class UserController {
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public String userInfo(ModelMap model) {
		model.addAttribute("user","Rod Jhonson");
		model.addAttribute("d",new java.util.Date());
		return "user";
	}
	
	@RequestMapping("/spring")
	public String showSecond() {
		return "second";
	}
}
