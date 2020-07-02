package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class Ccd{

	@SerializedName("tc")
	private String tc;

	@SerializedName("bgc")
	private String bgc;

	public String getTc(){
		return tc;
	}

	public String getBgc(){
		return bgc;
	}

	@Override
 	public String toString(){
		return 
			"Ccd{" + 
			"tc = '" + tc + '\'' + 
			",bgc = '" + bgc + '\'' + 
			"}";
		}
}