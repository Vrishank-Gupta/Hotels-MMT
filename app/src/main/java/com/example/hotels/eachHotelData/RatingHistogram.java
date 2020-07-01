package com.example.hotels.eachHotelData;

import com.google.gson.annotations.SerializedName;

public class RatingHistogram{

	@SerializedName("count_5")
	private String count5;

	@SerializedName("count_4")
	private String count4;

	@SerializedName("count_3")
	private String count3;

	@SerializedName("count_2")
	private String count2;

	@SerializedName("count_1")
	private String count1;

	public String getCount5(){
		return count5;
	}

	public String getCount4(){
		return count4;
	}

	public String getCount3(){
		return count3;
	}

	public String getCount2(){
		return count2;
	}

	public String getCount1(){
		return count1;
	}
}