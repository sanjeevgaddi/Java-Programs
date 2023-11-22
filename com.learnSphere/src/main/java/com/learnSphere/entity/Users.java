package com.learnSphere.entity;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.learnSphere.dao.CourseRepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Autowired
	CourseRepository cr;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Column(name="role")
	String role;
	@OneToMany
	List<Course> courses;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String name, String email, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Users(String name, String email, String password, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	public Course getCourse(Course course) {
		return  cr.findAllById((Iterable<Integer>) course).get(id);
	
	}

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}


}
