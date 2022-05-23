package com.exam.examserver.service.Impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exam.examserver.model.User;
import com.exam.examserver.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=this.userRepository.findByUsername(username);
		
		if(user==null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("No user found");
		}
		
		return user;
	}

}
