package com.reg.springboot.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.reg.springboot.model.User;
import com.reg.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
