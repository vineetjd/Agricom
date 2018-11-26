package com.farm.model;

public class FarmTrader {
	private int tID;
	private String tName;
	private long tMobileNo;
	private String tEmail;
	private String tPassword;
	private FarmAddress tAddr;
	private FarmBank tBank;
	
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public long gettMobileNo() {
		return tMobileNo;
	}
	public void settMobileNo(long tMobileNo) {
		this.tMobileNo = tMobileNo;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	public String gettPassword() {
		return tPassword;
	}
	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}
	public FarmAddress gettAddr() {
		return tAddr;
	}
	public void settAddr(FarmAddress tAddr) {
		this.tAddr = tAddr;
	}
	public FarmBank gettBank() {
		return tBank;
	}
	public void settBank(FarmBank tBank) {
		this.tBank = tBank;
	}
	
}
