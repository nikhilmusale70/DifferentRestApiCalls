package com.example.diff_calls;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiffCalls {
	@RequestMapping("/home")
	public String diffCalls(HttpServletRequest req) {
		String name = req.getParameter("name");
		return "Hello "+name;
	}
}
