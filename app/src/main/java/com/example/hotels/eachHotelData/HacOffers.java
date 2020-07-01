package com.example.hotels.eachHotelData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HacOffers{

	@SerializedName("offers")
	private List<OffersItem> offers;

	@SerializedName("all_booking_offers")
	private List<Object> allBookingOffers;

	@SerializedName("availability")
	private String availability;

	public List<OffersItem> getOffers(){
		return offers;
	}

	public List<Object> getAllBookingOffers(){
		return allBookingOffers;
	}

	public String getAvailability(){
		return availability;
	}
}