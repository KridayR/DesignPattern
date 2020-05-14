package com.learning.builder;

import com.learning.builder.model.Loan;

public class LoanDirector {

	public Loan ceateLoan(LoanBuilder loanBuilder) {
		loanBuilder.createCustomer();
		loanBuilder.validateKYC();
		loanBuilder.checkCibilScore();
		loanBuilder.createAccount();
		return loanBuilder.loan;

	}

}
