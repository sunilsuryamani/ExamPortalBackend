package com.exam.examserver;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting code..");
		
		User user = new User();
		
		user.setFirstname("sunil");
		user.setLastname("sam");
		user.setUsername("sunil1200");
		user.setPassword("adbcd123");
		user.setEmail("dasfn");
		user.setProfile("s.png");
		user.setPhone("1334");
		
		Role role1=new Role();
		role1.setRoleId(44L);
		role1.setRoleName("admin");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user, userRoleSet);
		
		System.out.println(user1.getUsername());
		
	}

}
