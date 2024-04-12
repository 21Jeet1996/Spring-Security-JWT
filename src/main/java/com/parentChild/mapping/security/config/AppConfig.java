package com.parentChild.mapping.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

	/*
	 * @Bean public UserDetailsService userDetailsService() {
	 * 
	 * UserDetails user =
	 * User.builder().username("amar").password(passwordEncoder().encode("amar123"))
	 * .roles("ADMIN") .build(); return new InMemoryUserDetailsManager(user);
	 * 
	 * }
	 */

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManger(AuthenticationConfiguration builder) throws Exception {
		return builder.getAuthenticationManager();

	}
}
