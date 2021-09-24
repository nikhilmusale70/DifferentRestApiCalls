package com.example.diff_calls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiffCalls {
	@RequestMapping("/home")
	public String diffCalls() {
		return "Hello World, With RESTfull apis";
	}
	
}
