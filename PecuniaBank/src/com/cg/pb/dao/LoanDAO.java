package com.cg.pb.dao;

public interface LoanDAO {

	public void createLoanRequest(long accNo, int loanId);

	void addLoanDetails();

	void loanDisburse(int creditScore, String loanStatus);

}
