package com.example.diff_calls;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DiffCalls {
	
	@RequestMapping(value = "/home/{fname}")
	public String diffCalls(@PathVariable("fname") String name,@RequestParam("lname") String lname) {
		System.out.println("hi");
		return "Hi "+name+" " +lname + ", Hello From Bridgelabz";

	}
	
}
