package com.tutorial.springsecurityclient.event;

import org.springframework.context.ApplicationEvent;

import com.tutorial.springsecurityclient.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterationCompleteEvent extends ApplicationEvent {
	
	private User user;
	private String applicationUrl;
	
	public RegisterationCompleteEvent(User user,String applicationUrl) {
		super(user);
		this.user = user;
		this.applicationUrl = applicationUrl;
	}

}
