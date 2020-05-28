package com.learning.creational.builder;

public class LoanProcessingFactory {
	
	public static LoanBuilder getLoanBuilder(String loanType) {
		if(loanType.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}else if(loanType.equalsIgnoreCase("Vehicle")) {
			return new VehicleLoan();
		}else {
			throw new UnsupportedOperationException();
		}
		
	}

	
}
