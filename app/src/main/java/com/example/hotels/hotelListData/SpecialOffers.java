package com.example.hotels.hotelListData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SpecialOffers{

	@SerializedName("desktop")
	private List<Object> desktop;

	@SerializedName("mobile")
	private List<Object> mobile;

	public List<Object> getDesktop(){
		return desktop;
	}

	public List<Object> getMobile(){
		return mobile;
	}
}