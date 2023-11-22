package com.learnSphere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	boolean existsByEmail(String email);

	Users getByEmail(String email);
	
	Users getByEmailAndPassword(String email, String password);

}
