package com.example.hotels.hoteldata;

import com.google.gson.annotations.SerializedName;

public class Small{

	@SerializedName("width")
	private String width;

	@SerializedName("url")
	private String url;

	@SerializedName("height")
	private String height;

	public String getWidth(){
		return width;
	}

	public String getUrl(){
		return url;
	}

	public String getHeight(){
		return height;
	}
}