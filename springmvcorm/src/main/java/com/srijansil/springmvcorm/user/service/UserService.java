package com.srijansil.springmvcorm.user.service;

import java.util.List;

import com.srijansil.springmvcorm.user.entity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUser();
	
	User findUserByid(int id);

}
