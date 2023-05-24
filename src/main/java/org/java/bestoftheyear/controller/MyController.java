package org.java.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MyController {	
	@GetMapping("/bestOfTheYear")
	public String bestOfTheYear(Model model,
			@RequestParam(name = "name") String name) {
		
		model.addAttribute("name", name);
		
		return "index";
	}
	
	@GetMapping("/user/{id}")
	public String sayHelloToId(Model model,
			@PathVariable("id") int id) {
		
		model.addAttribute("name", "Guybrush " + id);
		
		return "index";
	}
}
