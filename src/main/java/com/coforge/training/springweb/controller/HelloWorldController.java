/**
 * Author : Manish.6.Verma;
 * Date : Sep 27, 2025
 * Time : 2:30:35 PM
 * Project : spring-web
 */
package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * /* Work Flow of Spring MVC Application
 * 
 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
 *       -->Controller(HelloWorldController) ---> response(hello.jsp) 
 * 
 */
@Controller
public class HelloWorldController {

	@GetMapping("/manish")        //MAPPING URL OF THE REQUEST TO THR METHOD
	public String sayHello() {
		return "hello";           // IT RETURNS hello.jsp
	}
	
	
	
	@GetMapping("/noida")        //MAPPING URL OF THE REQUEST TO THR METHOD
	public String sayHello1() {
		return "noida";           // IT RETURNS noida.jsp
	}

}
