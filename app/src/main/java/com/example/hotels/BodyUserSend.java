package com.example.hotels;

import com.google.gson.annotations.SerializedName;

public class BodyUserSend{

	@SerializedName("name")
	private String name;

	@SerializedName("emailId")
	private String emailId;

	@SerializedName("userId")
	private String userId;

	public String getName(){
		return name;
	}

	public String getEmailId(){
		return emailId;
	}

	public String getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"BodyUserSend{" + 
			"name = '" + name + '\'' + 
			",emailId = '" + emailId + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}