package com.example.hotels.hoteldata;

import com.google.gson.annotations.SerializedName;

public class Photo{

	@SerializedName("images")
	private Images images;

	@SerializedName("is_blessed")
	private boolean isBlessed;

	@SerializedName("uploaded_date")
	private String uploadedDate;

	@SerializedName("caption")
	private String caption;

	@SerializedName("id")
	private String id;

	@SerializedName("helpful_votes")
	private String helpfulVotes;

	@SerializedName("published_date")
	private String publishedDate;

	@SerializedName("user")
	private User user;

	public Images getImages(){
		return images;
	}

	public boolean isIsBlessed(){
		return isBlessed;
	}

	public String getUploadedDate(){
		return uploadedDate;
	}

	public String getCaption(){
		return caption;
	}

	public String getId(){
		return id;
	}

	public String getHelpfulVotes(){
		return helpfulVotes;
	}

	public String getPublishedDate(){
		return publishedDate;
	}

	public User getUser(){
		return user;
	}
}