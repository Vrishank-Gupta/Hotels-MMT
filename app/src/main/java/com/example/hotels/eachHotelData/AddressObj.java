package com.example.hotels.eachHotelData;

import com.google.gson.annotations.SerializedName;

public class AddressObj{

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("postalcode")
	private String postalcode;

	@SerializedName("street1")
	private String street1;

	@SerializedName("street2")
	private String street2;

	@SerializedName("state")
	private Object state;

	public String getCountry(){
		return country;
	}

	public String getCity(){
		return city;
	}

	public String getPostalcode(){
		return postalcode;
	}

	public String getStreet1(){
		return street1;
	}

	public String getStreet2(){
		return street2;
	}

	public Object getState(){
		return state;
	}
}