package com.example.hotels.HotelHermes;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem implements Serializable {

	@SerializedName("hi")
	private List<HiItem> hi;

	@SerializedName("pr")
	private int pr;

	@SerializedName("lo")
	private double lo;

	@SerializedName("aci")
	private List<Integer> aci;

	@SerializedName("hn")
	private String hn;

	@SerializedName("cot")
	private String cot;

	@SerializedName("hr")
	private int hr;

	@SerializedName("do")
	private int jsonMemberDo;

	@SerializedName("gsv")
	private String gsv;

	@SerializedName("grti")
	private int grti;

	@SerializedName("rec")
	private int rec;

	@SerializedName("rac")
	private List<Integer> rac;

	@SerializedName("chc")
	private String chc;

	@SerializedName("ad")
	private List<Object> ad;

	@SerializedName("hfe")
	private int hfe;

	@SerializedName("is_aa")
	private int isAa;

	@SerializedName("tnc")
	private int tnc;

	@SerializedName("gtv")
	private String gtv;

	@SerializedName("sld")
	private String sld;

	@SerializedName("adp")
	private int adp;

	@SerializedName("apui")
	private int apui;

	@SerializedName("entr_prop")
	private String entrProp;

	@SerializedName("opr")
	private int opr;

	@SerializedName("bbp")
	private List<BbpItem> bbp;

	@SerializedName("vi")
	private int vi;

	@SerializedName("spr")
	private int spr;

	@SerializedName("nbi")
	private List<Integer> nbi;

	@SerializedName("gos_flag")
	private int gosFlag;

	@SerializedName("ami")
	private List<Integer> ami;

	@SerializedName("gseg")
	private String gseg;

	@SerializedName("ba")
	private int ba;

	@SerializedName("emi")
	private String emi;

	@SerializedName("bp")
	private List<BpItem> bp;

	@SerializedName("sb")
	private int sb;

	@SerializedName("sc")
	private String sc;

	@SerializedName("dtc")
	private int dtc;

	@SerializedName("si")
	private List<String> si;

	@SerializedName("oip")
	private List<OipItem> oip;

	@SerializedName("tgi")
	private List<Integer> tgi;

	@SerializedName("grc")
	private int grc;

	@SerializedName("hti")
	private List<Integer> hti;

	@SerializedName("arp")
	private List<ArpItem> arp;

	@SerializedName("gri")
	private int gri;

	@SerializedName("ch")
	private String ch;

	@SerializedName("pph")
	private String pph;

	@SerializedName("gr")
	private double gr;

	@SerializedName("l")
	private String L;

	@SerializedName("emid")
	private Object emid;

	@SerializedName("rtn")
	private String rtn;

	@SerializedName("cbm")
	private String cbm;

	@SerializedName("t")
	private String T;

	@SerializedName("ti")
	private int ti;

	@SerializedName("la")
	private double la;

	@SerializedName("ibp")
	private String ibp;

	@SerializedName("pxper")
	private int pxper;

	@SerializedName("tdi")
	private List<Integer> tdi;

	@SerializedName("hc")
	private String hc;

	@SerializedName("ofs")
	private String ofs;

	@SerializedName("pm")
	private int pm;

	@SerializedName("dspr")
	private int dspr;

	@SerializedName("hmd")
	private String hmd;

	@SerializedName("oi")
	private List<Integer> oi;

	@SerializedName("cf")
	private int cf;

	@SerializedName("cp2")
	private List<Cp2Item> cp2;

	@SerializedName("cp1")
	private List<Cp1Item> cp1;

	@SerializedName("npp")
	private List<NppItem> npp;

	@SerializedName("bpp")
	private List<BppItem> bpp;

	@SerializedName("aoi")
	private List<Integer> aoi;

	public List<HiItem> getHi(){
		return hi;
	}

	public int getPr(){
		return pr;
	}

	public double getLo(){
		return lo;
	}

	public List<Integer> getAci(){
		return aci;
	}

	public String getHn(){
		return hn;
	}

	public String getCot(){
		return cot;
	}

	public int getHr(){
		return hr;
	}

	public int getJsonMemberDo(){
		return jsonMemberDo;
	}

	public String getGsv(){
		return gsv;
	}

	public int getGrti(){
		return grti;
	}

	public int getRec(){
		return rec;
	}

	public List<Integer> getRac(){
		return rac;
	}

	public String getChc(){
		return chc;
	}

	public List<Object> getAd(){
		return ad;
	}

	public int getHfe(){
		return hfe;
	}

	public int getIsAa(){
		return isAa;
	}

	public int getTnc(){
		return tnc;
	}

	public String getGtv(){
		return gtv;
	}

	public String getSld(){
		return sld;
	}

	public int getAdp(){
		return adp;
	}

	public int getApui(){
		return apui;
	}

	public String getEntrProp(){
		return entrProp;
	}

	public int getOpr(){
		return opr;
	}

	public List<BbpItem> getBbp(){
		return bbp;
	}

	public int getVi(){
		return vi;
	}

	public int getSpr(){
		return spr;
	}

	public List<Integer> getNbi(){
		return nbi;
	}

	public int getGosFlag(){
		return gosFlag;
	}

	public List<Integer> getAmi(){
		return ami;
	}

	public String getGseg(){
		return gseg;
	}

	public int getBa(){
		return ba;
	}

	public String getEmi(){
		return emi;
	}

	public List<BpItem> getBp(){
		return bp;
	}

	public int getSb(){
		return sb;
	}

	public String getSc(){
		return sc;
	}

	public int getDtc(){
		return dtc;
	}

	public List<String> getSi(){
		return si;
	}

	public List<OipItem> getOip(){
		return oip;
	}

	public List<Integer> getTgi(){
		return tgi;
	}

	public int getGrc(){
		return grc;
	}

	public List<Integer> getHti(){
		return hti;
	}

	public List<ArpItem> getArp(){
		return arp;
	}

	public int getGri(){
		return gri;
	}

	public String getCh(){
		return ch;
	}

	public String getPph(){
		return pph;
	}

	public double getGr(){
		return gr;
	}

	public String getL(){
		return L;
	}

	public Object getEmid(){
		return emid;
	}

	public String getRtn(){
		return rtn;
	}

	public String getCbm(){
		return cbm;
	}

	public String getT(){
		return T;
	}

	public int getTi(){
		return ti;
	}

	public double getLa(){
		return la;
	}

	public String getIbp(){
		return ibp;
	}

	public int getPxper(){
		return pxper;
	}

	public List<Integer> getTdi(){
		return tdi;
	}

	public String getHc(){
		return hc;
	}

	public String getOfs(){
		return ofs;
	}

	public int getPm(){
		return pm;
	}

	public int getDspr(){
		return dspr;
	}

	public String getHmd(){
		return hmd;
	}

	public List<Integer> getOi(){
		return oi;
	}

	public int getCf(){
		return cf;
	}

	public List<Cp2Item> getCp2(){
		return cp2;
	}

	public List<Cp1Item> getCp1(){
		return cp1;
	}

	public List<NppItem> getNpp(){
		return npp;
	}

	public List<BppItem> getBpp(){
		return bpp;
	}

	public List<Integer> getAoi(){
		return aoi;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"hi = '" + hi + '\'' + 
			",pr = '" + pr + '\'' + 
			",lo = '" + lo + '\'' + 
			",aci = '" + aci + '\'' + 
			",hn = '" + hn + '\'' + 
			",cot = '" + cot + '\'' + 
			",hr = '" + hr + '\'' + 
			",do = '" + jsonMemberDo + '\'' + 
			",gsv = '" + gsv + '\'' + 
			",grti = '" + grti + '\'' + 
			",rec = '" + rec + '\'' + 
			",rac = '" + rac + '\'' + 
			",chc = '" + chc + '\'' + 
			",ad = '" + ad + '\'' + 
			",hfe = '" + hfe + '\'' + 
			",is_aa = '" + isAa + '\'' + 
			",tnc = '" + tnc + '\'' + 
			",gtv = '" + gtv + '\'' + 
			",sld = '" + sld + '\'' + 
			",adp = '" + adp + '\'' + 
			",apui = '" + apui + '\'' + 
			",entr_prop = '" + entrProp + '\'' + 
			",opr = '" + opr + '\'' + 
			",bbp = '" + bbp + '\'' + 
			",vi = '" + vi + '\'' + 
			",spr = '" + spr + '\'' + 
			",nbi = '" + nbi + '\'' + 
			",gos_flag = '" + gosFlag + '\'' + 
			",ami = '" + ami + '\'' + 
			",gseg = '" + gseg + '\'' + 
			",ba = '" + ba + '\'' + 
			",emi = '" + emi + '\'' + 
			",bp = '" + bp + '\'' + 
			",sb = '" + sb + '\'' + 
			",sc = '" + sc + '\'' + 
			",dtc = '" + dtc + '\'' + 
			",si = '" + si + '\'' + 
			",oip = '" + oip + '\'' + 
			",tgi = '" + tgi + '\'' + 
			",grc = '" + grc + '\'' + 
			",hti = '" + hti + '\'' + 
			",arp = '" + arp + '\'' + 
			",gri = '" + gri + '\'' + 
			",ch = '" + ch + '\'' + 
			",pph = '" + pph + '\'' + 
			",gr = '" + gr + '\'' + 
			",l = '" + L + '\'' + 
			",emid = '" + emid + '\'' + 
			",rtn = '" + rtn + '\'' + 
			",cbm = '" + cbm + '\'' + 
			",t = '" + T + '\'' + 
			",ti = '" + ti + '\'' + 
			",la = '" + la + '\'' + 
			",ibp = '" + ibp + '\'' + 
			",pxper = '" + pxper + '\'' + 
			",tdi = '" + tdi + '\'' + 
			",hc = '" + hc + '\'' + 
			",ofs = '" + ofs + '\'' + 
			",pm = '" + pm + '\'' + 
			",dspr = '" + dspr + '\'' + 
			",hmd = '" + hmd + '\'' + 
			",oi = '" + oi + '\'' + 
			",cf = '" + cf + '\'' + 
			",cp2 = '" + cp2 + '\'' + 
			",cp1 = '" + cp1 + '\'' + 
			",npp = '" + npp + '\'' + 
			",bpp = '" + bpp + '\'' + 
			",aoi = '" + aoi + '\'' + 
			"}";
		}
}