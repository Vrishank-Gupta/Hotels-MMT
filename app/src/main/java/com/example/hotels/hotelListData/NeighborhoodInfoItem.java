package com.example.hotels.hotelListData;

import com.google.gson.annotations.SerializedName;

public class NeighborhoodInfoItem{

	@SerializedName("name")
	private String name;

	@SerializedName("location_id")
	private String locationId;

	public String getName(){
		return name;
	}

	public String getLocationId(){
		return locationId;
	}
}