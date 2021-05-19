package com.johananedmeade.stringFamiliar.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String base() {
		return "The dojo is awesome!";
	}
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String location) {
		if(location.equals("Burbank")) {
			return "Burbank Dojo is located in Southern California.";
		}
		if(location.equals("San-Jose")) {
			return "SJ dojo is the headquarters.";
		}
		return "location";
	}
}
