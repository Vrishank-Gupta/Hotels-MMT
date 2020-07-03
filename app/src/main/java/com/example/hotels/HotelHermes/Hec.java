package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Hec implements Serializable {

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
			"Hec{" + 
			"tc = '" + tc + '\'' + 
			",bgc = '" + bgc + '\'' + 
			"}";
		}
}