package com.example.hotels.hotelListData;

import com.google.gson.annotations.SerializedName;

public class Images{

	@SerializedName("small")
	private Small small;

	@SerializedName("thumbnail")
	private Thumbnail thumbnail;

	@SerializedName("original")
	private Original original;

	@SerializedName("large")
	private Large large;

	@SerializedName("medium")
	private Medium medium;

	public Small getSmall(){
		return small;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public Original getOriginal(){
		return original;
	}

	public Large getLarge(){
		return large;
	}

	public Medium getMedium(){
		return medium;
	}
}