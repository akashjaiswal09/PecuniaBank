package com.cg.pb.service;

import com.cg.pb.bean.Loan;
import com.cg.pb.dao.LoanDAOImpl;

public class LoanServiceImpl implements LoanService{

	LoanDAOImpl dao = new LoanDAOImpl();

	@Override
	public void createLoanRequest(Loan loan) {
		dao.createLoanRequest(loan);
		
	}

	@Override
	public void loanDisburse(long accNo) {
		dao.loanDisburse(accNo);
		
	}

	@Override
	public void getLoanDetail(long accNo) {
		dao.getLoanDetail(accNo);
		
	}

}
