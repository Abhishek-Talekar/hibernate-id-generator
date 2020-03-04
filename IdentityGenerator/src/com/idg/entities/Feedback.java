package com.idg.entities;

import java.io.Serializable;

public class Feedback implements Serializable{
	protected int feedback_number;
	protected String user_name;
	protected String description;
	protected String product_name;
	protected int rating;
	public int getFeedback_number() {
		return feedback_number;
	}
	public void setFeedback_number(int feedback_number) {
		this.feedback_number = feedback_number;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [feedback_number=" + feedback_number + ", user_name=" + user_name + ", description="
				+ description + ", product_name=" + product_name + ", rating=" + rating + "]";
	}
	
	

}
