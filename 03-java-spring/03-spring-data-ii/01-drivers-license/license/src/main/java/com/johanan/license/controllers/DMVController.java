package com.johanan.license.controllers;

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

import com.johanan.license.models.License;
import com.johanan.license.models.Person;
import com.johanan.license.services.LicenseService;
import com.johanan.license.services.PersonService;

@Controller
public class DMVController {
	@Autowired
	private PersonService pServe;
	@Autowired
	private LicenseService lServe;
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/person/new")
	public String newPerson(@ModelAttribute("person")Person person) {
		return "person.jsp";
	}
	@PostMapping("/person/create")
	public String createPerson(@Valid @ModelAttribute("person")Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "person.jsp";
		}else {
			pServe.createP(person);
			return "redirect:/license/new";
		}
	}
	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license")License license, Model model) {
		List<Person> unlicensed= pServe.getUnlicensed();
		model.addAttribute("people", unlicensed);
		return "license.jsp";
	}
	@PostMapping("/license/create/")
	public String createLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if(result.hasErrors()) {
			return "license.jsp";
		}else {
			License lic =this.lServe.createL(license);
			Long thisId = lic.getPerson().getId();
			return "redirect:/persons/" + thisId;
		}
	}
	@GetMapping("/persons/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Person onePerson= pServe.getOnePerson(id);
		model.addAttribute("persons", onePerson);
		return "show.jsp";
	}
}
