package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tyhc implements Serializable {

	@SerializedName("Hostel")
	private int hostel;

	@SerializedName("Farmstay")
	private int farmstay;

	@SerializedName("Villa")
	private int villa;

	@SerializedName("Resort")
	private int resort;

	@SerializedName("Guest House")
	private int guestHouse;

	@SerializedName("Dharamshala")
	private int dharamshala;

	@SerializedName("Apartment")
	private int apartment;

	@SerializedName("Holiday Homes")
	private int holidayHomes;

	@SerializedName("Aparthotel")
	private int aparthotel;

	@SerializedName("Homestay")
	private int homestay;

	@SerializedName("BnB")
	private int bnB;

	@SerializedName("Ashram")
	private int ashram;

	@SerializedName("Hotel")
	private int hotel;

	public int getHostel(){
		return hostel;
	}

	public int getFarmstay(){
		return farmstay;
	}

	public int getVilla(){
		return villa;
	}

	public int getResort(){
		return resort;
	}

	public int getGuestHouse(){
		return guestHouse;
	}

	public int getDharamshala(){
		return dharamshala;
	}

	public int getApartment(){
		return apartment;
	}

	public int getHolidayHomes(){
		return holidayHomes;
	}

	public int getAparthotel(){
		return aparthotel;
	}

	public int getHomestay(){
		return homestay;
	}

	public int getBnB(){
		return bnB;
	}

	public int getAshram(){
		return ashram;
	}

	public int getHotel(){
		return hotel;
	}

	@Override
 	public String toString(){
		return 
			"Tyhc{" + 
			"hostel = '" + hostel + '\'' + 
			",farmstay = '" + farmstay + '\'' + 
			",villa = '" + villa + '\'' + 
			",resort = '" + resort + '\'' + 
			",guest House = '" + guestHouse + '\'' + 
			",dharamshala = '" + dharamshala + '\'' + 
			",apartment = '" + apartment + '\'' + 
			",holiday Homes = '" + holidayHomes + '\'' + 
			",aparthotel = '" + aparthotel + '\'' + 
			",homestay = '" + homestay + '\'' + 
			",bnB = '" + bnB + '\'' + 
			",ashram = '" + ashram + '\'' + 
			",hotel = '" + hotel + '\'' + 
			"}";
		}
}