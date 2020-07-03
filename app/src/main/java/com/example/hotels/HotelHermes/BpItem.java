package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BpItem implements Serializable {

	@SerializedName("pt")
	private String pt;

	@SerializedName("ccd")
	private Ccd ccd;

	@SerializedName("htd")
	private Htd htd;

	public String getPt(){
		return pt;
	}

	public Ccd getCcd(){
		return ccd;
	}

	public Htd getHtd(){
		return htd;
	}

	@Override
 	public String toString(){
		return 
			"BpItem{" + 
			"pt = '" + pt + '\'' + 
			",ccd = '" + ccd + '\'' + 
			",htd = '" + htd + '\'' + 
			"}";
		}
}