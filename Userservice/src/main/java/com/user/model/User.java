package com.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity

public class User {
	
	@Id
	private int uid;
	private String name;
	
	@Transient
	private List<Rating> ratings;
	
	public User() {
		super();
	}

	
	
	
	public User(int uid, String name, List<Rating> ratings) {
		super();
		this.uid = uid;
		this.name = name;
		this.ratings = ratings;
	}




	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	
	
	
	
	
	
}
