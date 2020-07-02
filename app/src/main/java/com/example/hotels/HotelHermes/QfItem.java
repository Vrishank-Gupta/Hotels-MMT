package com.example.hotels.HotelHermes;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class QfItem{

	@SerializedName("n")
	private String N;

	@SerializedName("fd")
	private Fd fd;

	@SerializedName("lf")
	private String lf;

	@SerializedName("o")
	private List<OItem> O;

	@SerializedName("m")
	private int M;

	public String getN(){
		return N;
	}

	public Fd getFd(){
		return fd;
	}

	public String getLf(){
		return lf;
	}

	public List<OItem> getO(){
		return O;
	}

	public int getM(){
		return M;
	}

	@Override
 	public String toString(){
		return 
			"QfItem{" + 
			"n = '" + N + '\'' + 
			",fd = '" + fd + '\'' + 
			",lf = '" + lf + '\'' + 
			",o = '" + O + '\'' + 
			",m = '" + M + '\'' + 
			"}";
		}
}