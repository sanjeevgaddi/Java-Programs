package com.learnSphere.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
	@Id
	
	int lesson_id;
	String lesson_name;
	String topics;
	String link;
	@ManyToOne
	Course course;
	
	public Lesson() {
		// TODO Auto-generated constructor stub
	}

	public Lesson(int lesson_id, String lesson_name, String topics, String link, Course course) {
		super();
		this.lesson_id = lesson_id;
		this.lesson_name = lesson_name;
		this.topics = topics;
		this.link = link;
		this.course = course;
	}

	public int getLesson_id() {
		return lesson_id;
	}

	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
	}

	public String getLesson_name() {
		return lesson_name;
	}

	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lesson [lesson_id=" + lesson_id + ", lesson_name=" + lesson_name + ", topics=" + topics + ", link="
				+ link + ", course=" + course + "]";
	}

	

}
