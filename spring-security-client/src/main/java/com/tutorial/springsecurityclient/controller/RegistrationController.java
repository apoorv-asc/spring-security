package com.tutorial.springsecurityclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.springsecurityclient.entity.User;
import com.tutorial.springsecurityclient.event.RegisterationCompleteEvent;
import com.tutorial.springsecurityclient.model.UserModel;
import com.tutorial.springsecurityclient.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ApplicationEventPublisher publisher;

	@PostMapping("/register")
	public String registerUser(@RequestBody UserModel userModel) {
		User user = userService.registerUser(userModel);
		
		publisher.publishEvent(new RegisterationCompleteEvent(user,"url"));
		return "Success";
	}
	
}
