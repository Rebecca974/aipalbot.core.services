package com.aipalbot.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.models.User;

@RestController
@RequestMapping("/api/v1/")
public class SignUpApi {

	@PostMapping("SignUp")
	public String display(@RequestBody User user) {
		String response = "you have been succefully Signup," +"\n" + user.getFirstname() + "\n"+ user.getLastname() + "\n"+ user.getEmailaddress() +"\n"+ user.getConfirmpassword();
		return response;

}
}
