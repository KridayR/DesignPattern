package com.learning.builder.model;

public class Loan {

	private String accountId;
	private String accountType;
	private String branchName;
	private String ifsccode;
	private CustomerDetails customerDetails;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "Loan [accountId=" + accountId + ", accountType=" + accountType + ", branchName=" + branchName
				+ ", ifsccode=" + ifsccode + ", customerDetails=" + customerDetails + "]";
	}

	
}
