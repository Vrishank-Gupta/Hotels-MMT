package com.example.hotels.eachHotelData;

import com.google.gson.annotations.SerializedName;

public class AmenitiesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("key")
	private String key;

	public String getName(){
		return name;
	}

	public String getKey(){
		return key;
	}

	@Override
	public String toString() {
		return "AmenitiesItem{" +
				"name='" + name + '\'' +
				", key='" + key + '\'' +
				'}';
	}
}