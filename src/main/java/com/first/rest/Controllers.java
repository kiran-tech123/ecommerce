package com.first.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@GetMapping("/greet")
	public ResponseEntity<String> getMessage(@RequestParam("name") String name) {
		String res = name +",Welcome to this Group  and Good Morning";
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}

	@GetMapping("/welcome")
	public String getHello() {
		String r = "Welcome to simple restapi";
		return r;
	}
}
