package com.example.demo.web;

import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/{userID}")
	public String getUserID(@PathVariable int userID) {
		return "Hey, the user id = " + userID;
	}
	
	@RequestMapping("/{userID}/invoice")
	public String getInvoice(@PathVariable int userID, @RequestParam(value="d", 
	required=false) Date dateOrNull) {
		return "We found the user with id " + userID+ " on " + dateOrNull;
	}
	
	@RequestMapping("/{userID}/items")
	public List<Object> itemInJson(@PathVariable int userID){
		return Arrays.asList("nitesh", "cool", userID);
	}
	
	@RequestMapping("/{userID}/products")
	public List<Product> productInJSON(){
		return Arrays.asList(new Product(1, "Sports Shoe", 60.99),
				new Product(2, "Slippers", 70.49),
				new Product(2, "School Shoe", 30.89));
	}
	
}
