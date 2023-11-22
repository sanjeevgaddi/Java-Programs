package com.learnSphere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Users;

public interface LsRepository extends JpaRepository<Users, Integer> {

}
