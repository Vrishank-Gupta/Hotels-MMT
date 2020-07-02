package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class Cp1Item{

	@SerializedName("pt")
	private String pt;

	@SerializedName("ccd")
	private Ccd ccd;

	@SerializedName("htd")
	private Htd htd;

	@SerializedName("ic")
	private String ic;

	@SerializedName("fd")
	private Fd fd;

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

	public Fd getFd(){
		return fd;
	}

	@Override
 	public String toString(){
		return 
			"Cp1Item{" + 
			"pt = '" + pt + '\'' + 
			",ccd = '" + ccd + '\'' + 
			",htd = '" + htd + '\'' + 
			",ic = '" + ic + '\'' + 
			",fd = '" + fd + '\'' + 
			"}";
		}
}