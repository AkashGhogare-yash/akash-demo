package com.example.OuthSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	
	@GetMapping("/public")
	public String getPublic() {
		return "This is Public API";
	}
	
	@GetMapping("/private")
	public String getPrivate() {
		return "This is Private API";
	}

}
