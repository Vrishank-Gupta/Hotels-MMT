package com.example.hotels.eachHotelData;

import com.google.gson.annotations.SerializedName;

public class OffersItem{

	@SerializedName("treatment")
	private String treatment;

	@SerializedName("content_id")
	private String contentId;

	@SerializedName("display_style")
	private String displayStyle;

	@SerializedName("auction_offer_key")
	private String auctionOfferKey;

	@SerializedName("link")
	private String link;

	@SerializedName("logo")
	private String logo;

	@SerializedName("internal_provider_name")
	private String internalProviderName;

	@SerializedName("is_bookable")
	private boolean isBookable;

	@SerializedName("availability")
	private String availability;

	@SerializedName("provider_display_name")
	private String providerDisplayName;

	public String getTreatment(){
		return treatment;
	}

	public String getContentId(){
		return contentId;
	}

	public String getDisplayStyle(){
		return displayStyle;
	}

	public String getAuctionOfferKey(){
		return auctionOfferKey;
	}

	public String getLink(){
		return link;
	}

	public String getLogo(){
		return logo;
	}

	public String getInternalProviderName(){
		return internalProviderName;
	}

	public boolean isIsBookable(){
		return isBookable;
	}

	public String getAvailability(){
		return availability;
	}

	public String getProviderDisplayName(){
		return providerDisplayName;
	}
}