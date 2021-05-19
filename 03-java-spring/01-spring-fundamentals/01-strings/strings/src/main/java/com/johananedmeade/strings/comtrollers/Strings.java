package com.johananedmeade.strings.comtrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Strings {
	@RequestMapping("/")
	public String string() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String string2() {
		return "Spring Boot is great, so easy to respond with strings.";
	}
}
