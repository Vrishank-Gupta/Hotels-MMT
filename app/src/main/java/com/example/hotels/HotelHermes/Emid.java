package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class Emid{

	@SerializedName("e6")
	private int e6;

	@SerializedName("e9")
	private int e9;

	@SerializedName("bas")
	private int bas;

	@SerializedName("tax")
	private int tax;

	@SerializedName("fin")
	private int fin;

	@SerializedName("e3")
	private int e3;

	public int getE6(){
		return e6;
	}

	public int getE9(){
		return e9;
	}

	public int getBas(){
		return bas;
	}

	public int getTax(){
		return tax;
	}

	public int getFin(){
		return fin;
	}

	public int getE3(){
		return e3;
	}

	@Override
 	public String toString(){
		return 
			"Emid{" + 
			"e6 = '" + e6 + '\'' + 
			",e9 = '" + e9 + '\'' + 
			",bas = '" + bas + '\'' + 
			",tax = '" + tax + '\'' + 
			",fin = '" + fin + '\'' + 
			",e3 = '" + e3 + '\'' + 
			"}";
		}
}