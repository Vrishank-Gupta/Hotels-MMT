package com.example.hotels.hoteldata;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CoordinateResponse{

	@SerializedName("osm_type")
	private String osmType;

	@SerializedName("osm_id")
	private String osmId;

	@SerializedName("licence")
	private String licence;

	@SerializedName("boundingbox")
	private List<String> boundingbox;

	@SerializedName("importance")
	private double importance;

	@SerializedName("icon")
	private String icon;

	@SerializedName("lon")
	private String lon;

	@SerializedName("display_name")
	private String displayName;

	@SerializedName("type")
	private String type;

	@SerializedName("class")
	private String jsonMemberClass;

	@SerializedName("place_id")
	private String placeId;

	@SerializedName("lat")
	private String lat;

	public String getOsmType(){
		return osmType;
	}

	public String getOsmId(){
		return osmId;
	}

	public String getLicence(){
		return licence;
	}

	public List<String> getBoundingbox(){
		return boundingbox;
	}

	public double getImportance(){
		return importance;
	}

	public String getIcon(){
		return icon;
	}

	public String getLon(){
		return lon;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getType(){
		return type;
	}

	@Override
	public String toString() {
		return "CoordinateResponse{" +
				"osmType='" + osmType + '\'' +
				", osmId='" + osmId + '\'' +
				", licence='" + licence + '\'' +
				", boundingbox=" + boundingbox +
				", importance=" + importance +
				", icon='" + icon + '\'' +
				", lon='" + lon + '\'' +
				", displayName='" + displayName + '\'' +
				", type='" + type + '\'' +
				", jsonMemberClass='" + jsonMemberClass + '\'' +
				", placeId='" + placeId + '\'' +
				", lat='" + lat + '\'' +
				'}';
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public String getPlaceId(){
		return placeId;
	}

	public String getLat(){
		return lat;
	}
}