package com.tutorial.springsecurityclient.service;

import org.springframework.stereotype.Service;

import com.tutorial.springsecurityclient.entity.User;
import com.tutorial.springsecurityclient.model.UserModel;

public interface UserService {

	User registerUser(UserModel userModel);

	void saveVerificationTokenForUser(String token, User user);
	
}
