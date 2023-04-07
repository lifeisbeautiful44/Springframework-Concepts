package com.srijansil.springmvcorm.user.dao;

import java.util.List;

import com.srijansil.springmvcorm.user.entity.User;

public interface UserDao {

	int create(User user);

	List<User> findUser();

	User findUser(int id);

}
