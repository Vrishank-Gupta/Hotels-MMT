package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DslItem implements Serializable {

	@SerializedName("ahc")
	private int ahc;

	@SerializedName("n")
	private String N;

	public int getAhc(){
		return ahc;
	}

	public String getN(){
		return N;
	}

	@Override
 	public String toString(){
		return 
			"DslItem{" + 
			"ahc = '" + ahc + '\'' + 
			",n = '" + N + '\'' + 
			"}";
		}
}