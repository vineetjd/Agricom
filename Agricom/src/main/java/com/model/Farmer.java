package com.model;

public class Farmer {
	private String name;
	private String email;
	private int mobileNo;
	private String password;
	private Address addr;
	private int farmArea;
	private String farmAddress;
	private int farmZip;
	private Bank bank;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getFarmArea() {
		return farmArea;
	}
	public void setFarmArea(int farmArea) {
		this.farmArea = farmArea;
	}
	public String getFarmAddress() {
		return farmAddress;
	}
	public void setFarmAddress(String farmAddress) {
		this.farmAddress = farmAddress;
	}
	public int getFarmZip() {
		return farmZip;
	}
	public void setFarmZip(int farmZip) {
		this.farmZip = farmZip;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
