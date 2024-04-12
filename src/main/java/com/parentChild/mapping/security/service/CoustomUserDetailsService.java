package com.parentChild.mapping.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.parentChild.mapping.security.entity.User;
import com.parentChild.mapping.security.repositorty.UserRepo;

@Service
public class CoustomUserDetailsService implements UserDetailsService {

	@Autowired
	public UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found !!"));
		return user;
	}

}
