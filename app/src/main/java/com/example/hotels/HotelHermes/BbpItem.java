package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BbpItem implements Serializable {

	@SerializedName("pt")
	private String pt;

	@SerializedName("ccd")
	private Ccd ccd;

	@SerializedName("htd")
	private Htd htd;

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

	public Fd getFd(){
		return fd;
	}

	@Override
 	public String toString(){
		return 
			"BbpItem{" + 
			"pt = '" + pt + '\'' + 
			",ccd = '" + ccd + '\'' + 
			",htd = '" + htd + '\'' + 
			",fd = '" + fd + '\'' + 
			"}";
		}
}