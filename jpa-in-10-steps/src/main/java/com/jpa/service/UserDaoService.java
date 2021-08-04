package com.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.entity.User;

@Repository
@Transactional
public class UserDaoService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		
		entityManager.persist(user);
		return user.getId();
	}
	
	/*
	   User jack = new User("jack","Admin");
	   User jill = new User("jill", "Admin");
	   
	   entityManager.persist(jack); entityManager track those only under the Persistence Context, here jack is under Persitence Context
	   
	   //Persistence Context
	    jack.setRole("User");
	    jill.setRole("User");
	    
	 */
	
	
}
