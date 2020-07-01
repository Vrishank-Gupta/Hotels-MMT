package com.example.hotels.hoteldata;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("member_id")
	private String memberId;

	@SerializedName("user_id")
	private Object userId;

	@SerializedName("type")
	private String type;

	public String getMemberId(){
		return memberId;
	}

	public Object getUserId(){
		return userId;
	}

	public String getType(){
		return type;
	}
}