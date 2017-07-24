package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author Manan
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return  "index";
	}
	
	@RequestMapping("/myAccount")
	public String myAccount() {
		return  "myAccount";
	}
}
