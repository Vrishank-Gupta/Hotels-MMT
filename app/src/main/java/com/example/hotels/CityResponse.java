package com.example.hotels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CityResponse{

	@SerializedName("1")
	private List<String> jsonMember1;

	public List<String> getJsonMember1(){
		return jsonMember1;
	}

	@Override
 	public String toString(){
		return 
			"CityResponse{" + 
			"1 = '" + jsonMember1 + '\'' + 
			"}";
		}
}