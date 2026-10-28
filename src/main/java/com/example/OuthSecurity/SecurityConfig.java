package com.example.OuthSecurity;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		
		http.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests( auth -> 
				auth.requestMatchers("/api/public").permitAll()
			.anyRequest().authenticated())
//			.httpBasic(Customizer.withDefaults());
			.oauth2Login(Customizer.withDefaults());
		
		
		return http.build();
		
	}

}
