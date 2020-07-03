package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DhGosafe implements Serializable {

	@SerializedName("idx")
	private int idx;

	public int getIdx(){
		return idx;
	}

	@Override
 	public String toString(){
		return 
			"DhGosafe{" + 
			"idx = '" + idx + '\'' + 
			"}";
		}
}