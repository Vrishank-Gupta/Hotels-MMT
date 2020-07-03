package com.example.hotels.HotelHermes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CollectionsItem implements Serializable {

	@SerializedName("st")
	private String st;

	@SerializedName("img")
	private String img;

	@SerializedName("t")
	private String T;

	@SerializedName("slug")
	private String slug;

	@SerializedName("desc")
	private String desc;

	public String getSt(){
		return st;
	}

	public String getImg(){
		return img;
	}

	public String getT(){
		return T;
	}

	public String getSlug(){
		return slug;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"CollectionsItem{" + 
			"st = '" + st + '\'' + 
			",img = '" + img + '\'' + 
			",t = '" + T + '\'' + 
			",slug = '" + slug + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}