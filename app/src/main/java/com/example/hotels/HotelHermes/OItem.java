package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class OItem{

	@SerializedName("d")
	private String D;

	@SerializedName("n")
	private String N;

	@SerializedName("fd")
	private Fd fd;

	public String getD(){
		return D;
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
			"OItem{" + 
			"d = '" + D + '\'' + 
			",n = '" + N + '\'' + 
			",fd = '" + fd + '\'' + 
			"}";
		}
}