package com.fulviocapone.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "roles", catalog = "spring_hibernate_tiles")
public class Role{

	private int idRole;
	private String role;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);

	public Role() {
	}

	public Role(int idRole, String role) {
		this.idRole = idRole;
		this.role = role;
	}

	public Role(int idRole, String role, Set<UserRole> userRole) {
		this.idRole = idRole;
		this.role = role;
		this.userRole = userRole;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	@Column(name = "role", nullable = false, length=50)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<UserRole> getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}
