package com.bootcampdsLearn.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcampdsLearn.dto.UserDTO;
import com.bootcampdsLearn.entities.User;
import com.bootcampdsLearn.repositories.UserRepository;
import com.bootcampdsLearn.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService {
		
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);
		if(user == null) {
		logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("User found: " + username);
		return user;
	}
	
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id){
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found " + id));
		return new UserDTO(entity);
	}

}
