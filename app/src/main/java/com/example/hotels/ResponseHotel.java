package com.example.hotels;

import java.util.List;

import com.example.hotels.hoteldata.DataItem;
import com.example.hotels.hoteldata.Paging;
import com.example.hotels.hoteldata.Status;
import com.google.gson.annotations.SerializedName;

public class ResponseHotel{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("paging")
	private Paging paging;

	@SerializedName("status")
	private Status status;

	public List<DataItem> getData(){
		return data;
	}

	public Paging getPaging(){
		return paging;
	}

	public Status getStatus(){
		return status;
	}

	@Override
	public String toString() {
		return "ResponseHotel{" +
				"data=" + data +
				", paging=" + paging +
				", status=" + status +
				'}';
	}
}