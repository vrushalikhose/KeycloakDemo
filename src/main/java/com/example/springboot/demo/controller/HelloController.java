package com.example.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

//import javax.annotation.security.RolesAllowed;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	/*//@GetMapping("/user")
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
	public String helloWorld(@RequestHeader String Authorization){
		
		return "Hello World";
	}*/
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	 public ResponseEntity<List<String>>hello(@RequestHeader String authorization){
		System.out.println("Auth: "+authorization);
		List<String> str = new ArrayList<>();
		str.add("Hi User");
		str.add("Have a great day!");
		 return ResponseEntity.ok().body(str);
	}
	
	
	/*@RequestMapping(value = "/books", method = RequestMethod.GET)
	 public ResponseEntity<List<Books>>getallbooks(@RequestHeader String Authorization){
		List<Books> books = new ArrayList<>();
		books.add(new Books(1,"Alchemist"));
		books.add(new Books(2,"5am club"));
		books.add(new Books(3,"Ikigai"));
		 return ResponseEntity.ok().body(books);
	}*/
	
	
}

