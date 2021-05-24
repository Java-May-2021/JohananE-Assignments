package com.edmeadeJohanan.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Code {
	@RequestMapping("/")
	public String main(@ModelAttribute("errors") String errors, Model models) {
		models.addAttribute("errors", errors);
		return "index.jsp";
	}
	@PostMapping("/code")
	public String code(@RequestParam(value="guess") String guess, RedirectAttributes redirectAttributes) {
		if(guess.equals("bushido")) {
			return "code.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!!");
			return "redirect:/";
		}
	}
};
