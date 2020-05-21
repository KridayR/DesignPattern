package com.learning.cloning;

public class Contact {

	private String phoneNo;
	private String pincode;

	public Contact(String phoneNo, String pincode) {
		super();
		this.phoneNo = phoneNo;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", pincode=" + pincode + "]";
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
