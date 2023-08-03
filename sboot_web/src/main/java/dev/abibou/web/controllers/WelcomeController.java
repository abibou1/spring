package dev.abibou.web.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView sendWelcomeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg", "Welcome!!!");
		
		LocalDate date = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	    String dateText = date.format(formatter);
	    
	    modelAndView.addObject("today", dateText);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
		
	}
}
