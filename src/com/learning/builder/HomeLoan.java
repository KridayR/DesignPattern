package com.learning.builder;

import com.learning.builder.model.CustomerDetails;

public class HomeLoan extends LoanBuilder {

	@Override
	void createCustomer() {
		this.loan.setCustomerDetails(new CustomerDetails(1, "raghu", "8105985300", "Bangalore"));

	}

	@Override
	boolean validateKYC() {		
		return true;
	}

	@Override
	int checkCibilScore() {		
		return 0;
	}

	@Override
	void createAccount() {
		loan.setAccountId("2332132");
		loan.setAccountType("Home");
		loan.setBranchName("RT nagar");
		loan.setIfsccode("HDFC100000");
	}

}
