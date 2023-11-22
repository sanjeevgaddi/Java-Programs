package com.learnSphere.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comments {
	
	@Id
	int comment_id;
	String comment;
	
	public Comments() {
		// TODO Auto-generated constructor stub
	}

	public Comments(int comment_id, String comment) {
		super();
		this.comment_id = comment_id;
		this.comment = comment;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comments [comment_id=" + comment_id + ", comment=" + comment + "]";
	}
	

}
