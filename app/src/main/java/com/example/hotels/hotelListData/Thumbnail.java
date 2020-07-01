package com.example.hotels.hotelListData;

import com.google.gson.annotations.SerializedName;

public class Thumbnail{

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