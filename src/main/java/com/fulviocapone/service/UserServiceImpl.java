package com.fulviocapone.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fulviocapone.dao.UserDAO;
import com.fulviocapone.model.User;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User getUser(String login) {
		return userDAO.getUser(login);
	}
	
}
