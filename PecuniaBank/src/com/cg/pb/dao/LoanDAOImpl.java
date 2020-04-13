package com.cg.pb.dao;

public class LoanDAOImpl implements LoanDAO {

	@Override
	public void createLoanRequest(long accNo, int loanId ) {
			
		loanId= loanId+1;
		
	}

	@Override
	public void addLoanDetails() {
		// TODO Auto-generated method stub
		
			}

	@Override
	public void loanDisburse(int creditScore, String loanStatus) {
		if(creditScore>=670) {
			loanStatus = "Accepted";
		}
		else {
			loanStatus = "Rejected";
		}
		
	}

	
	

}

