package com.example.diff_calls;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiffCalls {
	@RequestMapping("/home/{name}")
	public String diffCalls(@PathVariable String name) {
		return "Hi "+name + ", Hello From Bridgelabz";
	}
}
