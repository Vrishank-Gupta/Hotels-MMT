package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class BppItem{

	@SerializedName("pt")
	private String pt;

	@SerializedName("ccd")
	private Ccd ccd;

	@SerializedName("htd")
	private Htd htd;

	@SerializedName("ic")
	private String ic;

	public String getPt(){
		return pt;
	}

	public Ccd getCcd(){
		return ccd;
	}

	public Htd getHtd(){
		return htd;
	}

	public String getIc(){
		return ic;
	}

	@Override
 	public String toString(){
		return 
			"BppItem{" + 
			"pt = '" + pt + '\'' + 
			",ccd = '" + ccd + '\'' + 
			",htd = '" + htd + '\'' + 
			",ic = '" + ic + '\'' + 
			"}";
		}
}