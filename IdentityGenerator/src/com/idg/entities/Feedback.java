package com.idg.entities;

import java.io.Serializable;

public class Feedback implements Serializable{
	protected int feedbackNumber;
	protected String userName;
	protected String description;
	protected String productName;
	protected int rating;
	public int getFeedbackNumber() {
		return feedbackNumber;
	}
	public void setFeedbackNumber(int feedbackNumber) {
		this.feedbackNumber = feedbackNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackNumber=" + feedbackNumber + ", userName=" + userName + ", description=" + description
				+ ", productName=" + productName + ", rating=" + rating + "]";
	}
	
	
}
