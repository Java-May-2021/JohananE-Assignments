package com.johananEdmeade.displayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.text.SimpleDateFormat;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@Controller

public class DisplayDate {
	@GetMapping("/")
	public String main() {
		return "main.jsp";	
	}
	@GetMapping("/date")
	public String date(Model model) {
		Date day = new Date();
		SimpleDateFormat formatt = new SimpleDateFormat("EEEE, 'the' dd 'of' MM, yyyy");
		String strD = formatt.format(day);
		model.addAttribute("strD", strD);
		return "Date.jsp";
	}
	@GetMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat formatted = new SimpleDateFormat("HH:mm aa ");
		String strTime = formatted.format(time);
		model.addAttribute("strTime", strTime);
		return "time.jsp" ;
	}
}
