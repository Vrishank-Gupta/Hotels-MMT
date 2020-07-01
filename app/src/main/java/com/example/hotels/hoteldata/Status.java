package com.example.hotels.hoteldata;

import com.google.gson.annotations.SerializedName;

public class Status{

	@SerializedName("unfiltered_total_size")
	private String unfilteredTotalSize;

	@SerializedName("commerce_country_iso_code")
	private String commerceCountryIsoCode;

	@SerializedName("autobroadened")
	private boolean autobroadened;

	@SerializedName("progress")
	private String progress;

	@SerializedName("auction_key")
	private String auctionKey;

	@SerializedName("primary_geo")
	private String primaryGeo;

	@SerializedName("pricing")
	private String pricing;

	@SerializedName("doubleClickZone")
	private String doubleClickZone;

	public String getUnfilteredTotalSize(){
		return unfilteredTotalSize;
	}

	public String getCommerceCountryIsoCode(){
		return commerceCountryIsoCode;
	}

	public boolean isAutobroadened(){
		return autobroadened;
	}

	public String getProgress(){
		return progress;
	}

	public String getAuctionKey(){
		return auctionKey;
	}

	public String getPrimaryGeo(){
		return primaryGeo;
	}

	public String getPricing(){
		return pricing;
	}

	public String getDoubleClickZone(){
		return doubleClickZone;
	}
}