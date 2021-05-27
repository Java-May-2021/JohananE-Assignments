package com.edmeadeJohanan.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edmeadeJohanan.languages.models.Language;
import com.edmeadeJohanan.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService lServe;
	
	@GetMapping("/language")
	public String main(Model model) {
		List<Language> lang = lServe.allLanguages();
		model.addAttribute("lang", lang);
		return "index.jsp";
	}
	@PostMapping("/language")
	public String create(@Valid @ModelAttribute("language")Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
		lServe.createLang(language);
		return "redirect:/language";
		}
	}
	@GetMapping("/language/{id}")
	public String getLang(@PathVariable("id")Long id, Model model){
		Language lang = lServe.getOneLang(id); 
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	
	@GetMapping("/language/edit/{id}")
	public String editLang(@PathVariable("id")Long id, Model model) {
		Language lang = lServe.getOneLang(id);
		if(lang != null) {
			model.addAttribute("lang", lang);
			return "edit.jsp";
		}else {
			return "redirect:/language";
		}
	}
	@PostMapping("/language/edit/{id}")
	public String updateLang(@PathVariable("id")Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			lServe.updateLang(language);
			return "redirect:/language";
		}
	}
	@GetMapping("/language/delete/{id}")
	public String deleteLang(@PathVariable("id")Long id) {
		lServe.delete(id);
		return "redirect:/language";
	}
}	
