package com.cg.pb.dao;

import com.cg.pb.bean.Loan;

public interface LoanDAO {

	void createLoanRequest(Loan loan);
	void loanDisburse(long accNo);
	void getLoanDetail(long accNo);
}
