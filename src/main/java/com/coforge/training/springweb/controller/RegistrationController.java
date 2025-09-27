/**
 * Author : Manish.6.Verma;
 * Date : Sep 27, 2025
 * Time : 3:47:57 PM
 * Project : spring-web
 */
package com.coforge.training.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User;
/**
 * 
 */
@Controller
public class RegistrationController {
	
	//LOAD REGISTRATION FORM
	@GetMapping("/register")
	public String showRegisterForm(Model theModel) {
		theModel.addAttribute("user",new User());
		return "userRegistration";
	}
	
	//SUBMIT REGISTRATION FORM
	@PostMapping("/saveUser")
	public String submitForm(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user",user);
		return "success";
	}
	
	//VIEW REGISTRATION DETAILS

}
