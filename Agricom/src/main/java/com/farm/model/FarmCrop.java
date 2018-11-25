package com.farm.model;

public class FarmCrop {
	
	private String cName;
	private String cType;
	private String cFertilizer;
	private double cQuantity;
	private String cStatus;
	private double cBasePrice;
	private double cSellPrice;
	private FarmFarmer cFarmer;
	
	public FarmFarmer getcFarmer() {
		return cFarmer;
	}
	public void setcFarmer(FarmFarmer cFarmer) {
		this.cFarmer = cFarmer;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getcFertilizer() {
		return cFertilizer;
	}
	public void setcFertilizer(String cFertilizer) {
		this.cFertilizer = cFertilizer;
	}
	public double getcQuantity() {
		return cQuantity;
	}
	public void setcQuantity(double cQuantity) {
		this.cQuantity = cQuantity;
	}
	public String getcStatus() {
		return cStatus;
	}
	public void setcStatus(String cStatus) {
		this.cStatus = cStatus;
	}
	public double getcBasePrice() {
		return cBasePrice;
	}
	public void setcBasePrice(double cBasePrice) {
		this.cBasePrice = cBasePrice;
	}
	public double getcSellPrice() {
		return cSellPrice;
	}
	public void setcSellPrice(double cSellPrice) {
		this.cSellPrice = cSellPrice;
	}
}
