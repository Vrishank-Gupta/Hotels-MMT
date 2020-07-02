package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class FltItem{

	@SerializedName("ic")
	private String ic;

	@SerializedName("n")
	private String N;

	@SerializedName("fd")
	private Fd fd;

	public String getIc(){
		return ic;
	}

	public String getN(){
		return N;
	}

	public Fd getFd(){
		return fd;
	}

	@Override
 	public String toString(){
		return 
			"FltItem{" + 
			"ic = '" + ic + '\'' + 
			",n = '" + N + '\'' + 
			",fd = '" + fd + '\'' + 
			"}";
		}
}