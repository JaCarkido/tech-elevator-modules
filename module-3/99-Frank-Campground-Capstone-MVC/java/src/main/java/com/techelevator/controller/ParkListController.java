package com.techelevator.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.park.Park;
import com.techelevator.model.park.ParkDAO;

@Controller


public class ParkListController {

	@Autowired private ParkDAO dao;
	
	@RequestMapping("parkList")
	public String displayParkList(ModelMap parkMap){
		
		List<Park>parks = dao.getAllParks();
		parkMap.addAttribute("parks", parks);
		
		return "parkList";
	}
	
	
}
