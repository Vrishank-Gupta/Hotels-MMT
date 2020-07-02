package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class UtagItem{

	@SerializedName("fid")
	private String fid;

	public String getFid(){
		return fid;
	}

	@Override
 	public String toString(){
		return 
			"UtagItem{" + 
			"fid = '" + fid + '\'' + 
			"}";
		}
}