package com.cg.pb.service;

import com.cg.pb.bean.Loan;

public interface LoanService {
	
	void createLoanRequest(Loan loan);
	void loanDisburse(long accNo);
	void getLoanDetail(long accNo);
}
