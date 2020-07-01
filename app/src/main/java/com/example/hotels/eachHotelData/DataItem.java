package com.example.hotels.eachHotelData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("address_obj")
	private AddressObj addressObj;

	@SerializedName("amenities")
	private List<AmenitiesItem> amenities;

	@SerializedName("rating_histogram")
	private RatingHistogram ratingHistogram;

	@SerializedName("distance")
	private Object distance;

	@SerializedName("has_panoramic_photos")
	private boolean hasPanoramicPhotos;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("is_jfy_enabled")
	private boolean isJfyEnabled;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("description")
	private String description;

	@SerializedName("distance_string")
	private Object distanceString;

	@SerializedName("location_id")
	private String locationId;

	@SerializedName("hotel_class")
	private String hotelClass;

	@SerializedName("hac_offers")
	private HacOffers hacOffers;

	@SerializedName("price")
	private String price;

	@SerializedName("nearest_metro_station")
	private List<Object> nearestMetroStation;

	@SerializedName("write_review")
	private String writeReview;

	@SerializedName("ancestors")
	private List<AncestorsItem> ancestors;

	@SerializedName("longitude")
	private String longitude;

	@SerializedName("is_closed")
	private boolean isClosed;

	@SerializedName("is_long_closed")
	private boolean isLongClosed;

	@SerializedName("preferred_map_engine")
	private String preferredMapEngine;

	@SerializedName("address")
	private String address;

	@SerializedName("bearing")
	private Object bearing;

	@SerializedName("has_review_draft")
	private boolean hasReviewDraft;

	@SerializedName("local_name")
	private String localName;

	@SerializedName("parent_display_name")
	private String parentDisplayName;

	@SerializedName("location_string")
	private String locationString;

	@SerializedName("special_offers")
	private SpecialOffers specialOffers;

	@SerializedName("photo_count")
	private String photoCount;

	@SerializedName("business_listings")
	private BusinessListings businessListings;

	@SerializedName("web_url")
	private String webUrl;

	@SerializedName("price_level")
	private String priceLevel;

	@SerializedName("phone")
	private String phone;

	@SerializedName("awards")
	private List<Object> awards;

	@SerializedName("local_lang_code")
	private String localLangCode;

	@SerializedName("name")
	private String name;

	@SerializedName("listing_key")
	private String listingKey;

	@SerializedName("guide_count")
	private String guideCount;

	@SerializedName("local_address")
	private String localAddress;

	@SerializedName("num_reviews")
	private String numReviews;

	@SerializedName("category")
	private Category category;

	@SerializedName("subcategory")
	private List<SubcategoryItem> subcategory;

	@SerializedName("is_candidate_for_contact_info_suppression")
	private boolean isCandidateForContactInfoSuppression;

	public AddressObj getAddressObj(){
		return addressObj;
	}

	public List<AmenitiesItem> getAmenities(){
		return amenities;
	}

	public RatingHistogram getRatingHistogram(){
		return ratingHistogram;
	}

	public Object getDistance(){
		return distance;
	}

	public boolean isHasPanoramicPhotos(){
		return hasPanoramicPhotos;
	}

	public String getTimezone(){
		return timezone;
	}

	public boolean isIsJfyEnabled(){
		return isJfyEnabled;
	}

	public String getLatitude(){
		return latitude;
	}

	public String getDescription(){
		return description;
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

	public HacOffers getHacOffers(){
		return hacOffers;
	}

	public String getPrice(){
		return price;
	}

	public List<Object> getNearestMetroStation(){
		return nearestMetroStation;
	}

	public String getWriteReview(){
		return writeReview;
	}

	public List<AncestorsItem> getAncestors(){
		return ancestors;
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

	public String getAddress(){
		return address;
	}

	public Object getBearing(){
		return bearing;
	}

	public boolean isHasReviewDraft(){
		return hasReviewDraft;
	}

	public String getLocalName(){
		return localName;
	}

	public String getParentDisplayName(){
		return parentDisplayName;
	}

	public String getLocationString(){
		return locationString;
	}

	public SpecialOffers getSpecialOffers(){
		return specialOffers;
	}

	public String getPhotoCount(){
		return photoCount;
	}

	public BusinessListings getBusinessListings(){
		return businessListings;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public String getPriceLevel(){
		return priceLevel;
	}

	public String getPhone(){
		return phone;
	}

	public List<Object> getAwards(){
		return awards;
	}

	public String getLocalLangCode(){
		return localLangCode;
	}

	public String getName(){
		return name;
	}

	public String getListingKey(){
		return listingKey;
	}

	public String getGuideCount(){
		return guideCount;
	}

	public String getLocalAddress(){
		return localAddress;
	}

	public String getNumReviews(){
		return numReviews;
	}

	public Category getCategory(){
		return category;
	}

	public List<SubcategoryItem> getSubcategory(){
		return subcategory;
	}

	public boolean isIsCandidateForContactInfoSuppression(){
		return isCandidateForContactInfoSuppression;
	}

	@Override
	public String toString() {
		return "DataItem{" +
				"amenities=" + amenities +
				", price='" + price + '\'' +
				", locationString='" + locationString + '\'' +
				'}';
	}
}