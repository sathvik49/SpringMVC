package com.satvik.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.satvik.service.GenericWelcomeService;
/*import com.satvik.service.WelcomeService;*/

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String doWelcome(Model model){
		
		
		//1.Retrieve the process data 
		/*WelcomeService welcomeService = new WelcomeService();*/
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Satvik");
		
		// Add the data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// Return logical view name
		return "welcomeNew";
		
	}

}
