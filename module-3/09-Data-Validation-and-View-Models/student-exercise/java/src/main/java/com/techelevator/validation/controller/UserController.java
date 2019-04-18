package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;


@Controller
public class UserController {
	// GET: /
	@RequestMapping("/")
	public String getMainScreen() {
		
		return "homePage";
	}
		
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginPage(Model modelHolder) {
		if( ! modelHolder.containsAttribute("Login")) {		    
			modelHolder.addAttribute("Login", new Login());	   
		}
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String submitLoginForm(
			@Valid @ModelAttribute("Login") Login loginValues,  
			BindingResult result,		
			RedirectAttributes flash	
	){
		if(result.hasErrors()) {										
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Login", result);
																						
			flash.addFlashAttribute("Login", loginValues);		
			return "redirect:/login";								
		}																
		
		flash.addFlashAttribute("message", "You have successfully registered.");  
		
		return "redirect:/confirmation";										 
	}
	
	@RequestMapping("/confirmation")
	public String getConfirmationPage() {
		return "confirmation";
	}
	
	
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String getRegistrationPage(Model modelHolder) {
		if( ! modelHolder.containsAttribute("Registration")) {		    
			modelHolder.addAttribute("Registration", new Registration());	   
		}
		return "register";
	}
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String submitRegistrationForm(
			@Valid @ModelAttribute("Registration") Registration registrationValues,  
			BindingResult result,		
			RedirectAttributes flash	
	){
		if(result.hasErrors()) {										
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Registration", result);
																						
			flash.addFlashAttribute("Registration", registrationValues);		
			return "redirect:/register";								
		}																
		
		flash.addFlashAttribute("message", "You have successfully registered.");  
		
		return "redirect:/registrationConfirmation";										 
	}
	
	@RequestMapping("/registrationConfirmation")
	public String getRegistrtionConfirmationPage() {
		return "registrationConfirmation";
	}
	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view
}
