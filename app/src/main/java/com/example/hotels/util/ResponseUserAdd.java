package com.example.hotels.util;

import java.io.Serializable;
import java.util.List;

import com.example.hotels.HotelHermes.DataItem;
import com.google.gson.annotations.SerializedName;

public class ResponseUserAdd implements Serializable {

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("success")
	private boolean success;

	public List<DataItem> getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"ResponseUserAdd{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}