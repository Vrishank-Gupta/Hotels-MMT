package com.example.hotels.HotelHermes;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CityMetaInfo implements Serializable {

	@SerializedName("gos_msg")
	private String gosMsg;

	@SerializedName("gsm")
	private List<String> gsm;

	@SerializedName("lo")
	private double lo;

	@SerializedName("vcids")
	private List<String> vcids;

	@SerializedName("aostr")
	private List<String> aostr;

	@SerializedName("tabs")
	private List<String> tabs;

	@SerializedName("aocode")
	private List<String> aocode;

	@SerializedName("lgdin")
	private int lgdin;

	@SerializedName("sb")
	private int sb;

	@SerializedName("segments")
	private List<SegmentsItem> segments;

	@SerializedName("ata")
	private List<String> ata;

	@SerializedName("hcl")
	private List<String> hcl;

	@SerializedName("pot")
	private List<PotItem> pot;

	@SerializedName("isrnpl")
	private int isrnpl;

	@SerializedName("collections")
	private List<CollectionsItem> collections;

	@SerializedName("qf")
	private List<QfItem> qf;

	@SerializedName("hccm")
	private Hccm hccm;

	@SerializedName("sim")
	private Sim sim;

	@SerializedName("sl")
	private List<String> sl;

	@SerializedName("sb_msg")
	private String sbMsg;

	@SerializedName("ac")
	private List<String> ac;

	@SerializedName("avai_color")
	private List<String> avaiColor;

	@SerializedName("vcidsn")
	private List<String> vcidsn;

	@SerializedName("pid_max")
	private int pidMax;

	@SerializedName("pax")
	private String pax;

	@SerializedName("aty")
	private List<String> aty;

	@SerializedName("apu")
	private List<String> apu;

	@SerializedName("locexplore")
	private boolean locexplore;

	@SerializedName("grt")
	private List<String> grt;

	@SerializedName("lli")
	private Lli lli;

	@SerializedName("am")
	private List<String> am;

	@SerializedName("co")
	private String co;

	@SerializedName("scthr")
	private int scthr;

	@SerializedName("flt")
	private List<FltItem> flt;

	@SerializedName("ct")
	private String ct;

	@SerializedName("banner_type")
	private String bannerType;

	@SerializedName("ti")
	private int ti;

	@SerializedName("la")
	private double la;

	@SerializedName("amc")
	private Amc amc;

	@SerializedName("tyhc")
	private Tyhc tyhc;

	@SerializedName("coc")
	private String coc;

	@SerializedName("deals")
	private int deals;

	@SerializedName("altpx")
	private String altpx;

	@SerializedName("pxgrn")
	private int pxgrn;

	@SerializedName("dsl")
	private List<DslItem> dsl;

	@SerializedName("is_ipl")
	private int isIpl;

	@SerializedName("vcid")
	private String vcid;

	public String getGosMsg(){
		return gosMsg;
	}

	public List<String> getGsm(){
		return gsm;
	}

	public double getLo(){
		return lo;
	}

	public List<String> getVcids(){
		return vcids;
	}

	public List<String> getAostr(){
		return aostr;
	}

	public List<String> getTabs(){
		return tabs;
	}

	public List<String> getAocode(){
		return aocode;
	}

	public int getLgdin(){
		return lgdin;
	}

	public int getSb(){
		return sb;
	}

	public List<SegmentsItem> getSegments(){
		return segments;
	}

	public List<String> getAta(){
		return ata;
	}

	public List<String> getHcl(){
		return hcl;
	}

	public List<PotItem> getPot(){
		return pot;
	}

	public int getIsrnpl(){
		return isrnpl;
	}

	public List<CollectionsItem> getCollections(){
		return collections;
	}

	public List<QfItem> getQf(){
		return qf;
	}

	public Hccm getHccm(){
		return hccm;
	}

	public Sim getSim(){
		return sim;
	}

	public List<String> getSl(){
		return sl;
	}

	public String getSbMsg(){
		return sbMsg;
	}

	public List<String> getAc(){
		return ac;
	}

	public List<String> getAvaiColor(){
		return avaiColor;
	}

	public List<String> getVcidsn(){
		return vcidsn;
	}

	public int getPidMax(){
		return pidMax;
	}

	public String getPax(){
		return pax;
	}

	public List<String> getAty(){
		return aty;
	}

	public List<String> getApu(){
		return apu;
	}

	public boolean isLocexplore(){
		return locexplore;
	}

	public List<String> getGrt(){
		return grt;
	}

	public Lli getLli(){
		return lli;
	}

	public List<String> getAm(){
		return am;
	}

	public String getCo(){
		return co;
	}

	public int getScthr(){
		return scthr;
	}

	public List<FltItem> getFlt(){
		return flt;
	}

	public String getCt(){
		return ct;
	}

	public String getBannerType(){
		return bannerType;
	}

	public int getTi(){
		return ti;
	}

	public double getLa(){
		return la;
	}

	public Amc getAmc(){
		return amc;
	}

	public Tyhc getTyhc(){
		return tyhc;
	}

	public String getCoc(){
		return coc;
	}

	public int getDeals(){
		return deals;
	}

	public String getAltpx(){
		return altpx;
	}

	public int getPxgrn(){
		return pxgrn;
	}

	public List<DslItem> getDsl(){
		return dsl;
	}

	public int getIsIpl(){
		return isIpl;
	}

	public String getVcid(){
		return vcid;
	}

	@Override
 	public String toString(){
		return 
			"CityMetaInfo{" + 
			"gos_msg = '" + gosMsg + '\'' + 
			",gsm = '" + gsm + '\'' + 
			",lo = '" + lo + '\'' + 
			",vcids = '" + vcids + '\'' + 
			",aostr = '" + aostr + '\'' + 
			",tabs = '" + tabs + '\'' + 
			",aocode = '" + aocode + '\'' + 
			",lgdin = '" + lgdin + '\'' + 
			",sb = '" + sb + '\'' + 
			",segments = '" + segments + '\'' + 
			",ata = '" + ata + '\'' + 
			",hcl = '" + hcl + '\'' + 
			",pot = '" + pot + '\'' + 
			",isrnpl = '" + isrnpl + '\'' + 
			",collections = '" + collections + '\'' + 
			",qf = '" + qf + '\'' + 
			",hccm = '" + hccm + '\'' + 
			",sim = '" + sim + '\'' + 
			",sl = '" + sl + '\'' + 
			",sb_msg = '" + sbMsg + '\'' + 
			",ac = '" + ac + '\'' + 
			",avai_color = '" + avaiColor + '\'' + 
			",vcidsn = '" + vcidsn + '\'' + 
			",pid_max = '" + pidMax + '\'' + 
			",pax = '" + pax + '\'' + 
			",aty = '" + aty + '\'' + 
			",apu = '" + apu + '\'' + 
			",locexplore = '" + locexplore + '\'' + 
			",grt = '" + grt + '\'' + 
			",lli = '" + lli + '\'' + 
			",am = '" + am + '\'' + 
			",co = '" + co + '\'' + 
			",scthr = '" + scthr + '\'' + 
			",flt = '" + flt + '\'' + 
			",ct = '" + ct + '\'' + 
			",banner_type = '" + bannerType + '\'' + 
			",ti = '" + ti + '\'' + 
			",la = '" + la + '\'' + 
			",amc = '" + amc + '\'' + 
			",tyhc = '" + tyhc + '\'' + 
			",coc = '" + coc + '\'' + 
			",deals = '" + deals + '\'' + 
			",altpx = '" + altpx + '\'' + 
			",pxgrn = '" + pxgrn + '\'' + 
			",dsl = '" + dsl + '\'' + 
			",is_ipl = '" + isIpl + '\'' + 
			",vcid = '" + vcid + '\'' + 
			"}";
		}
}