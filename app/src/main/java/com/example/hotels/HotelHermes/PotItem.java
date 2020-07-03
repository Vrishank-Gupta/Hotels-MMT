package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PotItem implements Serializable {

	@SerializedName("ot")
	private String ot;

	@SerializedName("oi")
	private String oi;

	public String getOt(){
		return ot;
	}

	public String getOi(){
		return oi;
	}

	@Override
 	public String toString(){
		return 
			"PotItem{" + 
			"ot = '" + ot + '\'' + 
			",oi = '" + oi + '\'' + 
			"}";
		}
}