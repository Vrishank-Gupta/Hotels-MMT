package com.example.hotels.util;

import com.google.gson.annotations.SerializedName;

public class ResponseURL{

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"ResponseURL{" + 
			"url = '" + url + '\'' + 
			"}";
		}
}