package com.example.trial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.trial.models.User;
import com.example.trial.repository.UserRepsitory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api
public class UserController {
	
	@Autowired
	private UserRepsitory userRepository;
	
	@GetMapping(path="/demo/viewUsers")
	@ApiOperation(value = "show users")
	public String getUsers(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "viewUsers";
	}
	
	@GetMapping(path="/error")
	@ApiOperation(value="show error page")
	public String getPage() {
		return "error";
	}
	
	@GetMapping(path="/demo/add")
	@ApiOperation(value="show welcome page")
	public String getWelcome() {
		return "add";
	}
	
	@PostMapping(path="/demo/add")
	@ApiOperation(value="add users to the database")
	public String addUser(@RequestParam String name, @RequestParam String email){

		User user = new User();
		user.setName(name);
		user.setEmail(email);		
		userRepository.save(user);
		
		return "redirect:/demo/viewUsers";
		
	}

}
