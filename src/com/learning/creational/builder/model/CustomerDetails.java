package com.learning.creational.builder.model;

public class CustomerDetails {

	private int custId;
	private String custName;
	private String mobileNo;
	private String address;

	public CustomerDetails(int custId, String custName, String mobileNo, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", custName=" + custName + ", mobileNo=" + mobileNo + ", address="
				+ address + "]";
	}

}
