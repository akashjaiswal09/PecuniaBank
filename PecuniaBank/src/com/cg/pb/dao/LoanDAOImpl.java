package com.cg.pb.dao;

import java.util.ArrayList;

import com.cg.pb.bean.Loan;

public class LoanDAOImpl implements LoanDAO {

	ArrayList<Loan> loanList = new ArrayList<Loan>();

	@Override
	public void createLoanRequest(Loan loan) {

		loanList.add(loan);

	}

	@Override
	public void loanDisburse(long accNo) {
		loanList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if (x.getCreditScore() >= 670) {
				x.setLoanStatus("Accepted");
				System.out.println("Loan Accepted");
			}
			else {
				x.setLoanStatus("Rejected");
				System.out.println("Loan Rejected");
			}
		});
	}

	@Override
	public void getLoanDetail(long accNo) {
		loanList.stream().filter(x -> x.getAccNo() == accNo).forEach(System.out::println);
	}
}
