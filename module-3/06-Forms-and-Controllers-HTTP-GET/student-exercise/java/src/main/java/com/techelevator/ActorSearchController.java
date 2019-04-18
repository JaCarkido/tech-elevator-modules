package com.techelevator;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;
	
	@RequestMapping(path= {"/","/actorList"}, method=RequestMethod.GET)
	public String displayHomePage(Model holder) {
		if(! holder.containsAttribute("Actor")) {
			holder.addAttribute("Actor", new Actor());
		}
		return "actorList";
	}
	
	
	@RequestMapping(path="/actorList", method=RequestMethod.POST)
	public String submitLoginForm(
			@Valid @ModelAttribute("Actor") Actor actorValues,  
			BindingResult result,		
			RedirectAttributes flash	
	){
		if(result.hasErrors()) {										
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Actor", result);
																						
			flash.addFlashAttribute("Actor", actorValues);		
			return "redirect:/actorList";								
		}																
		
		flash.addFlashAttribute("actors", actorDao.getMatchingActors(actorValues.getLastName()));  
		
		return "redirect:/actorList";										 
	}
	
	

	
	
//	@RequestMapping(path="/actorListResult", method=RequestMethod.GET)
//	public String displayActorListResult(Model holder) {
//		if(! holder.containsAttribute("Actor")) {
//			holder.addAttribute("Actor", new Actor());
//		}
//		return "actorListResult";
//	}
//	
//	@RequestMapping(path="/actorListResult", method=RequestMethod.POST)
//	public String submitActorListResultForm(
//			@Valid @ModelAttribute("ActorSearch") Actor actorValues,  
//			BindingResult result,		
//			RedirectAttributes flash	
//	){
//		if(result.hasErrors()) {										
//			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Login", result);
//																						
//			flash.addFlashAttribute("Actor", actorValues);		
//			return "redirect:/actorList";								
//		}																
//		
//		flash.addFlashAttribute("actors", actorDao.getMatchingActors(actorValues.getLastName()));  
//		
//		return "redirect:/actorListResult";										 
//	}
//	
//	
	
		/* What request mapping do we want here */
	public String showSearchActorForm() {
		return null;
	}

	/* What about here? */
	public String searchActors(/* What arguments go here to get parameters from the page? */) {
		/* Call the model and pass values to the jsp */
		return null;
	}
}
