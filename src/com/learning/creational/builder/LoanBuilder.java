package com.learning.creational.builder;

import com.learning.creational.builder.model.Loan;

public abstract class LoanBuilder {

	Loan loan = new Loan();

	abstract void createCustomer();

	abstract boolean validateKYC();

	abstract int checkCibilScore();

	abstract void createAccount();

	public Loan buildLoan() {
		return this.loan;
	}

}