package com.johananedmeade.helloHumans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloHumans {
	@RequestMapping("human")
	public String index(Model model, @RequestParam(value="name", required=false) String name, @RequestParam(value="lname", required=false)String lname) {
		model.addAttribute("name", name);
		model.addAttribute("lname", lname);
		return "index.jsp";
	}
}
