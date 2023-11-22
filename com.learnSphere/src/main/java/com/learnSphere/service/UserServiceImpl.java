package com.learnSphere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.dao.UserRepository;
import com.learnSphere.entity.Users;

@Service
public class UserServiceImpl  implements UserService{
	
	UserRepository  repo;
	@Autowired
	public UserServiceImpl(UserRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "Student Added Successfully!.";
	}

	@Override
	public boolean chechemail(String email) {
		
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
		if(repo.existsByEmail(email))
		{
			Users u=repo.getByEmail(email);
			String dbpassword=u.getPassword();
			if(password.equals(dbpassword))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public Users getUser(String email) {
		Users u=repo.getByEmail(email);
		return u;
	}

	@Override
	public Object UserRole(String email) {
		Users u=repo.getByEmail(email);
		String role=u.getRole();
		return role;
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		
	}
	
	

}
