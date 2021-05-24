package com.edmeadeJohanan.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
@RequestMapping("/your_server")
public class Counter {
	@RequestMapping("") 
	public String count(HttpSession session) {
		Integer currentCount = (Integer)session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		return "main.jsp";
	}
	@RequestMapping("/counter")
	public String main(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		model.addAttribute("counted", session.getAttribute("count"));
		return "counter.jsp";
	}
	@RequestMapping("/counter-two") 
	public String countt(HttpSession session) {
		Integer currentCount = (Integer)session.getAttribute("count");
		currentCount+= 2;
		session.setAttribute("count", currentCount);
		return "two_count.jsp";
	}
}
