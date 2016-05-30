package com.fulviocapone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fulviocapone.dao.RoleDAO;
import com.fulviocapone.model.Role;

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}
	
}
