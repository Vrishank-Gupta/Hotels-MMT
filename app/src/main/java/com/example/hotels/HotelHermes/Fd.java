package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Fd implements Serializable {

	@SerializedName("tag")
	private String tag;

	public String getTag(){
		return tag;
	}

	@Override
 	public String toString(){
		return 
			"Fd{" + 
			"tag = '" + tag + '\'' + 
			"}";
		}
}