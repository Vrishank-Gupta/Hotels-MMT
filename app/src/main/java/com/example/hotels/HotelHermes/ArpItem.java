package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

public class ArpItem{

	@SerializedName("pt")
	private String pt;

	@SerializedName("ccd")
	private Ccd ccd;

	@SerializedName("htd")
	private Htd htd;

	@SerializedName("fd")
	private Fd fd;

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

	public Fd getFd(){
		return fd;
	}

	public String getIc(){
		return ic;
	}

	@Override
 	public String toString(){
		return 
			"ArpItem{" + 
			"pt = '" + pt + '\'' + 
			",ccd = '" + ccd + '\'' + 
			",htd = '" + htd + '\'' + 
			",fd = '" + fd + '\'' + 
			",ic = '" + ic + '\'' + 
			"}";
		}
}