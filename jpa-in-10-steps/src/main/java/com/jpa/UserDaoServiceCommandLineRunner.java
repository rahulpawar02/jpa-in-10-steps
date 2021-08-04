package com.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.User;
import com.jpa.service.UserDaoService;
import com.jpa.service.UserRepository;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
//	@Autowired
//	private UserDaoService userDaoService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg) throws Exception {
		User user = new User("jill","Admin");
		
			userRepository.save(user);
		
		log.info("New User is created:"+user);
		
		Optional<User> userWithId = userRepository.findById(1L);
		log.info("New User is retrived:"+userWithId);
		
		List<User> users = userRepository.findAll();
		
		log.info("all users:"+users);
	}
	
	
}
