package com.jsp.blog.services;

import java.util.List;

import com.jsp.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateuser(UserDto user, Integer userId);
	UserDto getuserById(Integer userId);
	List<UserDto> getAllUsers();
	
	void deleteuser(Integer userId);

}
