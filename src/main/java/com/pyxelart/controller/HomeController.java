package com.pyxelart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pyxelart.model.User;
import com.pyxelart.repo.UserRepository;

@Controller
public class HomeController {

	
	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/user")
	@ResponseBody
	public String saveUser() {
		User user = new User(null, "Gabriel8819", "secret123");
		
		this.userRepo.save(user);
		
		return "success test";
	}
	
	
}
