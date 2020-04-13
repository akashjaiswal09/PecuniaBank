package com.cg.pb.service;

import com.cg.pb.dao.LoanDAOImpl;

public class LoanServiceImpl implements LoanService{

	LoanDAOImpl dao = new LoanDAOImpl();
	@Override
	public void createLoanRequest(long accNo, int loanId) {
		dao.createLoanRequest(accNo, loanId);
		
	}

	@Override
	public void addLoanDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanDisburse(int creditScore, String loanStatus) {
		dao.loanDisburse(creditScore, loanStatus);
		
	}

}
