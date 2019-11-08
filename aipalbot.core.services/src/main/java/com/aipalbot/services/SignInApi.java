package com.aipalbot.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.models.User;

@RestController
@RequestMapping("/api/v1/")
public class SignInApi {
	
	@PostMapping("SignIn")
	public String display(@RequestBody User user) {
		
		
		String response = "you are Authomatic SignIn:" + "\n"+ user.getEmail() + "\n" + user.getPassword() + "\n" ;
		
		return response;
	}
	

}
