package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class Amc{

	@SerializedName("Airport Transfer (on Demand)")
	private int airportTransferOnDemand;

	@SerializedName("Power backup")
	private int powerBackup;

	@SerializedName("Spa")
	private int spa;

	@SerializedName("Swimming Pool")
	private int swimmingPool;

	@SerializedName("Business Services")
	private int businessServices;

	@SerializedName("Pets allowed")
	private int petsAllowed;

	@SerializedName("Banquet hall")
	private int banquetHall;

	@SerializedName("CCTV surveillance")
	private int cCTVSurveillance;

	@SerializedName("Front desk")
	private int frontDesk;

	@SerializedName("Clean linen")
	private int cleanLinen;

	@SerializedName("Laundry Service")
	private int laundryService;

	@SerializedName("Clean Room")
	private int cleanRoom;

	@SerializedName("Room Service")
	private int roomService;

	@SerializedName("Dining")
	private int dining;

	@SerializedName("Outdoor Activities")
	private int outdoorActivities;

	@SerializedName("Indoor Entertainment")
	private int indoorEntertainment;

	@SerializedName("Smoking Rooms Available")
	private int smokingRoomsAvailable;

	@SerializedName("Daily housekeeping")
	private int dailyHousekeeping;

	@SerializedName("Travel Assistance")
	private int travelAssistance;

	@SerializedName("Health-Spa")
	private int healthSpa;

	@SerializedName("Restaurant/Coffee Shop")
	private int restaurantCoffeeShop;

	@SerializedName("Air Conditioning")
	private int airConditioning;

	@SerializedName("Kitchen")
	private int kitchen;

	@SerializedName("Doctor On Call")
	private int doctorOnCall;

	@SerializedName("Conference Room")
	private int conferenceRoom;

	@SerializedName("Internet")
	private int internet;

	@SerializedName("Free Internet")
	private int freeInternet;

	@SerializedName("Parking Facility")
	private int parkingFacility;

	public int getAirportTransferOnDemand(){
		return airportTransferOnDemand;
	}

	public int getPowerBackup(){
		return powerBackup;
	}

	public int getSpa(){
		return spa;
	}

	public int getSwimmingPool(){
		return swimmingPool;
	}

	public int getBusinessServices(){
		return businessServices;
	}

	public int getPetsAllowed(){
		return petsAllowed;
	}

	public int getBanquetHall(){
		return banquetHall;
	}

	public int getCCTVSurveillance(){
		return cCTVSurveillance;
	}

	public int getFrontDesk(){
		return frontDesk;
	}

	public int getCleanLinen(){
		return cleanLinen;
	}

	public int getLaundryService(){
		return laundryService;
	}

	public int getCleanRoom(){
		return cleanRoom;
	}

	public int getRoomService(){
		return roomService;
	}

	public int getDining(){
		return dining;
	}

	public int getOutdoorActivities(){
		return outdoorActivities;
	}

	public int getIndoorEntertainment(){
		return indoorEntertainment;
	}

	public int getSmokingRoomsAvailable(){
		return smokingRoomsAvailable;
	}

	public int getDailyHousekeeping(){
		return dailyHousekeeping;
	}

	public int getTravelAssistance(){
		return travelAssistance;
	}

	public int getHealthSpa(){
		return healthSpa;
	}

	public int getRestaurantCoffeeShop(){
		return restaurantCoffeeShop;
	}

	public int getAirConditioning(){
		return airConditioning;
	}

	public int getKitchen(){
		return kitchen;
	}

	public int getDoctorOnCall(){
		return doctorOnCall;
	}

	public int getConferenceRoom(){
		return conferenceRoom;
	}

	public int getInternet(){
		return internet;
	}

	public int getFreeInternet(){
		return freeInternet;
	}

	public int getParkingFacility(){
		return parkingFacility;
	}

	@Override
 	public String toString(){
		return 
			"Amc{" + 
			"airport Transfer (on Demand) = '" + airportTransferOnDemand + '\'' + 
			",power backup = '" + powerBackup + '\'' + 
			",spa = '" + spa + '\'' + 
			",swimming Pool = '" + swimmingPool + '\'' + 
			",business Services = '" + businessServices + '\'' + 
			",pets allowed = '" + petsAllowed + '\'' + 
			",banquet hall = '" + banquetHall + '\'' + 
			",cCTV surveillance = '" + cCTVSurveillance + '\'' + 
			",front desk = '" + frontDesk + '\'' + 
			",clean linen = '" + cleanLinen + '\'' + 
			",laundry Service = '" + laundryService + '\'' + 
			",clean Room = '" + cleanRoom + '\'' + 
			",room Service = '" + roomService + '\'' + 
			",dining = '" + dining + '\'' + 
			",outdoor Activities = '" + outdoorActivities + '\'' + 
			",indoor Entertainment = '" + indoorEntertainment + '\'' + 
			",smoking Rooms Available = '" + smokingRoomsAvailable + '\'' + 
			",daily housekeeping = '" + dailyHousekeeping + '\'' + 
			",travel Assistance = '" + travelAssistance + '\'' + 
			",health-Spa = '" + healthSpa + '\'' + 
			",restaurant/Coffee Shop = '" + restaurantCoffeeShop + '\'' + 
			",air Conditioning = '" + airConditioning + '\'' + 
			",kitchen = '" + kitchen + '\'' + 
			",doctor On Call = '" + doctorOnCall + '\'' + 
			",conference Room = '" + conferenceRoom + '\'' + 
			",internet = '" + internet + '\'' + 
			",free Internet = '" + freeInternet + '\'' + 
			",parking Facility = '" + parkingFacility + '\'' + 
			"}";
		}
}