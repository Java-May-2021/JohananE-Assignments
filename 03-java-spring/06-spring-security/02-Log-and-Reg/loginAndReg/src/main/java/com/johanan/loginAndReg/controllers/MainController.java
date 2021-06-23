package com.johanan.loginAndReg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.johanan.loginAndReg.models.User;
import com.johanan.loginAndReg.service.UserService;
import com.johanan.loginAndReg.validators.UserValidators;

@Controller
public class MainController {
	@Autowired
	private UserService uServe;
	@Autowired
	private UserValidators uValid;
	@GetMapping("/login")
	public String login(@ModelAttribute("user")User user) {
		return "login.jsp";
	}
	@PostMapping("/register/create")
	public String createUser(@Valid @ModelAttribute("user")User user, BindingResult result, HttpSession session) {
		uValid.validate(user, result);
		if(result.hasErrors()) {
			return "register.jsp";
		}else {
			User newUser = this.uServe.registerUser(user);
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/welcome";
		}
	}
	@GetMapping("/welcome")
	public String welcome(HttpSession session, Model viewModel) {
		if(session.getAttribute("user_id")==null) {
			return "redirect:/login";
		}
		Long userId = (Long)session.getAttribute("user_id");
		User users = this.uServe.findOneId(userId);
		viewModel.addAttribute("user", users);
		return "welcome.jsp";
	}
	@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/login";
		}
	@GetMapping("/registration")
	public String register(@ModelAttribute("user")User user) {
		return "registration.jsp";
	}
	@PostMapping("/login/user")
	public String loginUser(@RequestParam("loginEmail")String email, @RequestParam("loginPass")String password, RedirectAttributes redirects, HttpSession sesh) {
		if(!this.uServe.authenticate(email, password)) {
			redirects.addFlashAttribute("loginError","Invalid Username or password.");
			return "redirect:/login";
		}
		User user = this.uServe.getByEmail(email);
		sesh.setAttribute("user_id", user.getId());
		return "redirect:/welcome";
		
	}
}
