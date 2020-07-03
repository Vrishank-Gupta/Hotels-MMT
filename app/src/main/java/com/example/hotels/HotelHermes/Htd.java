package com.example.hotels.HotelHermes;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Htd implements Serializable {

	@SerializedName("ftc")
	private String ftc;

	@SerializedName("hec")
	private Hec hec;

	@SerializedName("h")
	private String H;

	@SerializedName("ht")
	private List<String> ht;

	@SerializedName("hoc")
	private Hoc hoc;

	@SerializedName("ft")
	private String ft;

	public String getFtc(){
		return ftc;
	}

	public Hec getHec(){
		return hec;
	}

	public String getH(){
		return H;
	}

	public List<String> getHt(){
		return ht;
	}

	public Hoc getHoc(){
		return hoc;
	}

	public String getFt(){
		return ft;
	}

	@Override
 	public String toString(){
		return 
			"Htd{" + 
			"ftc = '" + ftc + '\'' + 
			",hec = '" + hec + '\'' + 
			",h = '" + H + '\'' + 
			",ht = '" + ht + '\'' + 
			",hoc = '" + hoc + '\'' + 
			",ft = '" + ft + '\'' + 
			"}";
		}
}