package com.example.hotels.hoteldata;

import com.google.gson.annotations.SerializedName;

public class Paging{

	@SerializedName("results")
	private String results;

	@SerializedName("total_results")
	private String totalResults;

	public String getResults(){
		return results;
	}

	public String getTotalResults(){
		return totalResults;
	}
}