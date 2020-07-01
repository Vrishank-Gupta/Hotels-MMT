package com.example.hotels.hoteldata;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BusinessListings{

	@SerializedName("mobile_contacts")
	private List<Object> mobileContacts;

	@SerializedName("desktop_contacts")
	private List<Object> desktopContacts;

	public List<Object> getMobileContacts(){
		return mobileContacts;
	}

	public List<Object> getDesktopContacts(){
		return desktopContacts;
	}
}