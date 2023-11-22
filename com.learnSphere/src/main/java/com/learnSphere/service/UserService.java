package com.learnSphere.service;

import com.learnSphere.entity.Users;

public interface UserService {
	
	public String addUser(Users user);
	public boolean  chechemail(String email);
	public boolean validate(String email,String password);
	public Users getUser(String email);
	public Object UserRole(String email);
	public void updateUser(Users user);

}
