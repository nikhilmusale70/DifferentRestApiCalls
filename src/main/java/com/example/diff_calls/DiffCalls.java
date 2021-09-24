package com.example.diff_calls;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiffCalls {
	@RequestMapping("/home")
	public String diffCalls(@RequestParam("name") String name, HttpSession session) {
		return "Hello "+name;
	}
}
