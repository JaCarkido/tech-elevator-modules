package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping("/filmList")
    public String displayFilmList(HttpServletRequest request) {   
    	int minLength = Integer.parseInt(request.getParameter("maxLength"));
    	int maxLength = Integer.parseInt(request.getParameter("minLength"));
    	String genre = request.getParameter("genre");
    	
    	List<Film> matchingList = filmDao.getFilmsBetween(genre, minLength, maxLength);
    	return "filmList";
    }
    
//    @RequestMapping("/actorList")
//	public String displayActorList(HttpServletRequest request) {
//		String actorLastName = request.getParameter("actorName");
//		List<Actor> matchingList = actorDao.getMatchingActors(actorLastName);
//		request.setAttribute("actorList", matchingList);
//		return "actorList";
//	}

    public String showFilmSearchForm() {
        return null;
    }

    public String searchFilms() {
        return null;
    }
    
    
}