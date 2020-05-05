package com.example.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/start", method = RequestMethod.GET)
public class HelloController {
	
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String hello() {
		return "<h2>Hello World!</h2>";
	}
	
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String hello2() {
		return "Hey, Hope you are doing good :)";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String newUser() {
		return "<h2>User Forms</h2>\n" + 
				"\n" + 
				"<form action=\"/start/new-user\" method=\"POST\">\n" + 
				"  <label for=\"fname\">First name:</label><br>\n" + 
				"  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" + 
				"  <label for=\"lname\">Last name:</label><br>\n" + 
				"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" + 
				"  <input type=\"submit\" value=\"Submit\">\n" + 
				"</form> ";
	}
	
	@RequestMapping(value="/new-user", method = RequestMethod.POST)
	public String print(@RequestParam String fname, String lname) {
		return "User is added successfully: "+ fname + " " +lname;
	}
	
	@RequestMapping(value="/order/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		return "Order id = "+ id;
	}
}
