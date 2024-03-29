package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sim implements Serializable {

	@SerializedName("dh_gosafe")
	private DhGosafe dhGosafe;

	@SerializedName("dh_premium_safety")
	private DhPremiumSafety dhPremiumSafety;

	public DhGosafe getDhGosafe(){
		return dhGosafe;
	}

	public DhPremiumSafety getDhPremiumSafety(){
		return dhPremiumSafety;
	}

	@Override
 	public String toString(){
		return 
			"Sim{" + 
			"dh_gosafe = '" + dhGosafe + '\'' + 
			",dh_premium_safety = '" + dhPremiumSafety + '\'' + 
			"}";
		}
}