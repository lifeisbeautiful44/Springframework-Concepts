package com.srijansil.springmvcorm.user.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srijansil.springmvcorm.user.dao.UserDao;
import com.srijansil.springmvcorm.user.entity.User;
import com.srijansil.springmvcorm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// Businness logic
		int result = userdao.create(user);
		return result;
	}

	@Override
	public List<User> getUser() {

		return userdao.findUser();
	}

	@Override
	public User findUserByid(int id) {
		return userdao.findUser(id);
	}

}
