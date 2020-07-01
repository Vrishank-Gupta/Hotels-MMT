package com.example.hotels.eachHotelData;

import com.google.gson.annotations.SerializedName;

public class Status{

	@SerializedName("unfiltered_total_size")
	private String unfilteredTotalSize;

	@SerializedName("pricing_disclaimer")
	private String pricingDisclaimer;

	@SerializedName("unavailable")
	private String unavailable;

	@SerializedName("commerce_country_iso_code")
	private String commerceCountryIsoCode;

	@SerializedName("no_prices")
	private String noPrices;

	@SerializedName("autobroadened")
	private boolean autobroadened;

	@SerializedName("progress")
	private String progress;

	@SerializedName("auction_key")
	private String auctionKey;

	@SerializedName("impression_key")
	private String impressionKey;

	@SerializedName("pricing")
	private String pricing;

	public String getUnfilteredTotalSize(){
		return unfilteredTotalSize;
	}

	public String getPricingDisclaimer(){
		return pricingDisclaimer;
	}

	public String getUnavailable(){
		return unavailable;
	}

	public String getCommerceCountryIsoCode(){
		return commerceCountryIsoCode;
	}

	public String getNoPrices(){
		return noPrices;
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

	public String getImpressionKey(){
		return impressionKey;
	}

	public String getPricing(){
		return pricing;
	}
}