package com.example.hotels.hotelListData;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("distance")
	private String distance;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("raw_ranking")
	private String rawRanking;

	@SerializedName("rating")
	private String rating;

	@SerializedName("ranking_denominator")
	private String rankingDenominator;

	@SerializedName("distance_string")
	private Object distanceString;

	@SerializedName("location_id")
	private String locationId;

	@SerializedName("hotel_class")
	private String hotelClass;

	@SerializedName("price")
	private String price;

	@SerializedName("ranking_geo_id")
	private String rankingGeoId;

	@SerializedName("ranking_category")
	private String rankingCategory;

	@SerializedName("ranking_position")
	private String rankingPosition;

	@SerializedName("longitude")
	private String longitude;

	@SerializedName("is_closed")
	private boolean isClosed;

	@SerializedName("is_long_closed")
	private boolean isLongClosed;

	@SerializedName("preferred_map_engine")
	private String preferredMapEngine;

	@SerializedName("subcategory_type_label")
	private String subcategoryTypeLabel;

	@SerializedName("ranking_geo")
	private String rankingGeo;

	@SerializedName("bearing")
	private String bearing;

	@SerializedName("photo")
	private Photo photo;

	@SerializedName("location_string")
	private String locationString;

	@SerializedName("special_offers")
	private SpecialOffers specialOffers;

	@SerializedName("subcategory_type")
	private String subcategoryType;

	@SerializedName("business_listings")
	private BusinessListings businessListings;

	@SerializedName("price_level")
	private String priceLevel;

	@SerializedName("awards")
	private List<Object> awards;

	@SerializedName("name")
	private String name;

	@SerializedName("listing_key")
	private String listingKey;

	@SerializedName("num_reviews")
	private String numReviews;

	@SerializedName("ranking")
	private String ranking;

	@SerializedName("neighborhood_info")
	private List<NeighborhoodInfoItem> neighborhoodInfo;

	public String getDistance(){
		return distance;
	}

	public String getTimezone(){
		return timezone;
	}

	public String getLatitude(){
		return latitude;
	}

	public String getRawRanking(){
		return rawRanking;
	}

	public String getRating(){
		return rating;
	}

	public String getRankingDenominator(){
		return rankingDenominator;
	}

	public Object getDistanceString(){
		return distanceString;
	}

	public String getLocationId(){
		return locationId;
	}

	public String getHotelClass(){
		return hotelClass;
	}

	public String getPrice(){
		return price;
	}

	public String getRankingGeoId(){
		return rankingGeoId;
	}

	public String getRankingCategory(){
		return rankingCategory;
	}

	public String getRankingPosition(){
		return rankingPosition;
	}

	public String getLongitude(){
		return longitude;
	}

	public boolean isIsClosed(){
		return isClosed;
	}

	public boolean isIsLongClosed(){
		return isLongClosed;
	}

	public String getPreferredMapEngine(){
		return preferredMapEngine;
	}

	public String getSubcategoryTypeLabel(){
		return subcategoryTypeLabel;
	}

	public String getRankingGeo(){
		return rankingGeo;
	}

	public String getBearing(){
		return bearing;
	}

	public Photo getPhoto(){
		return photo;
	}

	public String getLocationString(){
		return locationString;
	}

	public SpecialOffers getSpecialOffers(){
		return specialOffers;
	}

	public String getSubcategoryType(){
		return subcategoryType;
	}

	public BusinessListings getBusinessListings(){
		return businessListings;
	}

	public String getPriceLevel(){
		return priceLevel;
	}

	public List<Object> getAwards(){
		return awards;
	}

	public String getName(){
		return name;
	}

	public String getListingKey(){
		return listingKey;
	}

	public String getNumReviews(){
		return numReviews;
	}

	public String getRanking(){
		return ranking;
	}

	public List<NeighborhoodInfoItem> getNeighborhoodInfo(){
		return neighborhoodInfo;
	}

	@Override
	public String toString() {
		return "DataItem{" +
				"distance='" + distance + '\'' +
				", timezone='" + timezone + '\'' +
				", latitude='" + latitude + '\'' +
				", rawRanking='" + rawRanking + '\'' +
				", rating='" + rating + '\'' +
				", rankingDenominator='" + rankingDenominator + '\'' +
				", distanceString=" + distanceString +
				", locationId='" + locationId + '\'' +
				", hotelClass='" + hotelClass + '\'' +
				", price='" + price + '\'' +
				", rankingGeoId='" + rankingGeoId + '\'' +
				", rankingCategory='" + rankingCategory + '\'' +
				", rankingPosition='" + rankingPosition + '\'' +
				", longitude='" + longitude + '\'' +
				", isClosed=" + isClosed +
				", isLongClosed=" + isLongClosed +
				", preferredMapEngine='" + preferredMapEngine + '\'' +
				", subcategoryTypeLabel='" + subcategoryTypeLabel + '\'' +
				", rankingGeo='" + rankingGeo + '\'' +
				", bearing='" + bearing + '\'' +
				", photo=" + photo +
				", locationString='" + locationString + '\'' +
				", specialOffers=" + specialOffers +
				", subcategoryType='" + subcategoryType + '\'' +
				", businessListings=" + businessListings +
				", priceLevel='" + priceLevel + '\'' +
				", awards=" + awards +
				", name='" + name + '\'' +
				", listingKey='" + listingKey + '\'' +
				", numReviews='" + numReviews + '\'' +
				", ranking='" + ranking + '\'' +
				", neighborhoodInfo=" + neighborhoodInfo +
				'}';
	}
}