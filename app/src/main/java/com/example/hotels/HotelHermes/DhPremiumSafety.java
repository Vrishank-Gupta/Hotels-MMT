package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class DhPremiumSafety{

	@SerializedName("idx")
	private int idx;

	public int getIdx(){
		return idx;
	}

	@Override
 	public String toString(){
		return 
			"DhPremiumSafety{" + 
			"idx = '" + idx + '\'' + 
			"}";
		}
}