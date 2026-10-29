package com.example.OuthSecurity.login;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@PutMapping("/")
	public String userLogin() {
		return "Login Success";
	}

}
