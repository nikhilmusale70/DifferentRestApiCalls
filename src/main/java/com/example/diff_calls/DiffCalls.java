package com.example.diff_calls;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class DiffCalls {
	
	@RequestMapping(value = "/home" , method = RequestMethod.POST)
	@ResponseBody
	public String diffCalls(@RequestBody Map<String, String>json) {
		System.out.println("hi");
		return "Hi "+json.get("fname")+" "+json.get("lname") + ", Hello From Bridgelabz";

	}
}
