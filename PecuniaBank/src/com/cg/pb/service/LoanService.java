package com.cg.pb.service;


public interface LoanService {
	
	void createLoanRequest(long accNo, int loanId);

	void addLoanDetails();

	void loanDisburse(int creditScore, String loanStatus);

}
