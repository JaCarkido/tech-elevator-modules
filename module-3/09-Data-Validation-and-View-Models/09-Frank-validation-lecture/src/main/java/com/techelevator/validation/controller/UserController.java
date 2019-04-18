package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.SignUp;

@Controller
public class UserController {
	
	// GET: /
	// Display homePage vie with greeting and invitation to sign up for mailing list 
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	
	// GET: /mailingList
	// Display empty mailingList view 
	
	@RequestMapping(path="/mailingList", method=RequestMethod.GET)	//This is the answer to our ShoppingCart map problem
	public String showRegisterForm(Model modelHolder) {             //Define a Model called modeModel
		if( ! modelHolder.containsAttribute("SignUp")) {		    //If modeHolder does Not have a SignUp attribute
			modelHolder.addAttribute("SignUp", new SignUp());	    // give it one - new SignUp Object
		}
		return "mailingList";
	}
	
	// POST: /mailingList
	// Validate the model and redirect to confirmation (if successful) 
	// or return the mailingList view (if validation fails)

	@RequestMapping(path="/mailingList", method=RequestMethod.POST)
	public String submitRegisterForm(
			@Valid @ModelAttribute("SignUp") SignUp registerFormValues,  //validate the data in model entry sign-up and put the data in a sign-up object
			BindingResult result,		//<------------------------------- object to hold the result of validation
			RedirectAttributes flash	//<------------------------------- define a flash object (exists only for the next request
	){
		if(result.hasErrors()) {										// if there were any validation errors
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "SignUp", result); // add data to flash object
																						//key=MODEL_KEY_PREFIX constant + name of model data
																						//value = BindingResult object from validate
																						//UserController.SignUp
			flash.addFlashAttribute("SignUp", registerFormValues);		// add data to the model used in view
			return "redirect:/mailingList";								// redirect to /mailingList GET controller
		}																// redisplay with error message
		
		flash.addFlashAttribute("message", "You have successfully registered.");  //if no errors = set a message
		
		return "redirect:/confirmation";										  // redirect to confirmation
	}
	
	

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String showConfirmationView() {
		return "confirmation";
	}
}
