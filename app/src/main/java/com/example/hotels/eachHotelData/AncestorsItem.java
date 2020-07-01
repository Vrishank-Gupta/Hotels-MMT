package com.example.hotels.eachHotelData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AncestorsItem{

	@SerializedName("abbrv")
	private Object abbrv;

	@SerializedName("name")
	private String name;

	@SerializedName("subcategory")
	private List<SubcategoryItem> subcategory;

	@SerializedName("location_id")
	private String locationId;

	public Object getAbbrv(){
		return abbrv;
	}

	public String getName(){
		return name;
	}

	public List<SubcategoryItem> getSubcategory(){
		return subcategory;
	}

	public String getLocationId(){
		return locationId;
	}
}