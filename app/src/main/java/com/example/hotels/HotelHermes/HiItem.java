package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class HiItem{

	@SerializedName("si")
	private String si;

	@SerializedName("mi")
	private String mi;

	public String getSi(){
		return si;
	}

	public String getMi(){
		return mi;
	}

	@Override
 	public String toString(){
		return 
			"HiItem{" + 
			"si = '" + si + '\'' + 
			",mi = '" + mi + '\'' + 
			"}";
		}
}