package com.learnSphere.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id
	int course_id;
	String course_name;
	int course_price;
	@ManyToMany
	List<Lesson> lessons;
	@ManyToOne
	List<Users> userlist;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int course_id, String course_name, int course_price, List<Lesson> lessons, List<Users> userlist) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_price = course_price;
		this.lessons = lessons;
		this.userlist = userlist;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_price() {
		return course_price;
	}
	public void setCourse_price(int course_price) {
		this.course_price = course_price;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	public List<Users> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<Users> userlist) {
		this.userlist = userlist;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_price=" + course_price
				+ ", lessons=" + lessons + ", userlist=" + userlist + "]";
	}
	
	

	
	
}
