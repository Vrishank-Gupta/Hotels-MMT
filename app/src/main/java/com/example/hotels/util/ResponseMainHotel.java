package com.example.hotels.util;

import java.io.Serializable;
import java.util.List;

import com.example.hotels.HotelHermes.CityMetaInfo;
import com.example.hotels.HotelHermes.DataItem;
import com.google.gson.annotations.SerializedName;

public class ResponseMainHotel implements Serializable {

	public ResponseMainHotel(){}

	@SerializedName("next")
	private String next;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("city_meta_info")
	private CityMetaInfo cityMetaInfo;

	public String getNext(){
		return next;
	}

	public List<DataItem> getData(){
		return data;
	}

	public CityMetaInfo getCityMetaInfo(){
		return cityMetaInfo;
	}

	@Override
 	public String toString(){
		return 
			"ResponseMainHotel{" + 
			"next = '" + next + '\'' + 
			",data = '" + data + '\'' + 
			",city_meta_info = '" + cityMetaInfo + '\'' + 
			"}";
		}
}