package com.smartbill360.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.smartbill360.entity.User;
import com.smartbill360.repo.UserRepo;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> userOp = this.getByEmail(username);
		if(userOp.isPresent())
			return userOp.get();
		throw new UsernameNotFoundException("Invalid Email Id");
	}
	
	public Optional<User> getByEmail(String username) {
		return userRepo.findById(username);
	}

}
