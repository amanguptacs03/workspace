package com.learntodrive.model;

import java.util.Date; //super class of sql.date

public class License {
	private String number;
	private String issuingRTO;
	private Date expiryDate;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIssuingRTO() {
		return issuingRTO;
	}
	public void setIssuingRTO(String issuingRTO) {
		this.issuingRTO = issuingRTO;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
