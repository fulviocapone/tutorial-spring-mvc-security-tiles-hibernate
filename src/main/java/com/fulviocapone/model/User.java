package com.fulviocapone.model;


import java.util.HashSet;
import java.util.Set;

public class User{

	private String email;
	private String password;
	private boolean enabled;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);

	public User() {
	}

	public User(String email, String password, boolean enabled) {
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}

	public User(String email, String password, boolean enabled, Set<UserRole> userRole) {
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}
