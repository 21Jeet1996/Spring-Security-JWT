package com.parentChild.mapping.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parentChild.mapping.service.UserService;

@RestController
@RequestMapping("/home")
public class TestController {

	@Autowired
	private UserService userService;

	@GetMapping("user")
	public String getUser() {

		System.out.println("heloo");
		return userService.getUser().toString();
	}

	@GetMapping("/current-user")
	public String getLoginUser(Principal principal) {
		return principal.toString();
	}

}
