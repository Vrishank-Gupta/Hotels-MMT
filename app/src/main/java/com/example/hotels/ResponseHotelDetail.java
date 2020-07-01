package com.example.hotels;

import java.util.List;

import com.example.hotels.eachHotelData.DataItem;
import com.example.hotels.eachHotelData.Status;
import com.google.gson.annotations.SerializedName;

public class ResponseHotelDetail {

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("status")
	private Status status;

	public List<DataItem> getData(){
		return data;
	}

	public Status getStatus(){
		return status;
	}

	@Override
	public String toString() {
		return "ResponseHotelDetail{" +
				"data=" + data +
				", status=" + status +
				'}';
	}
}