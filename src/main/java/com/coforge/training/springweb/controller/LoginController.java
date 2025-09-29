/**
 * Author : Manish.6.Verma;
 * Date : Sep 29, 2025
 * Time : 12:05:58 PM
 * Project : spring-web
 */
package com.coforge.training.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User1;
/**
 * 
 */
@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User1());
		return "login";
	}

	@PostMapping("/login")
	public String processLogin(@ModelAttribute("user") User1 user, Model model) {
		if ("admin".equals(user.getUsername()) && "12345".equals(user.getPassword())) {
			model.addAttribute("username", user.getUsername());
			return "loginSuccess";
		} else {
			return "failure";
		}
	}
}
