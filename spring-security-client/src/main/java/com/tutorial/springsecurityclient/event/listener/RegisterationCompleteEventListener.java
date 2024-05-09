package com.tutorial.springsecurityclient.event.listener;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import com.tutorial.springsecurityclient.entity.User;
import com.tutorial.springsecurityclient.event.RegisterationCompleteEvent;
import com.tutorial.springsecurityclient.service.UserService;

public class RegisterationCompleteEventListener implements ApplicationListener<RegisterationCompleteEvent> {
	
	@Autowired
	private UserService userService;
	
	@Override
	public void onApplicationEvent(RegisterationCompleteEvent event) {
//		Create verification token for the user with the link
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		userService.saveVerificationTokenForUser(token,user);
		
//		Send Mail
		
		
		
	}
}
