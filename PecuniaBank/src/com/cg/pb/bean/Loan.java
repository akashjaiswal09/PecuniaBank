package com.cg.pb.bean;

public class Loan {
	long accNo;
	double amount;
	int tenure;
	int creditScore;
	double roi;
	String loanType;
	String loanStatus;

	public long getAccNo() {
		return accNo;
	}

	public long setAccNo(long accNo) {
		return this.accNo = accNo;
	}

	public double getAmount() {
		return amount;
	}

	public double setAmount(double amount) {
		return this.amount = amount;
	}

	public int getTenure() {
		return tenure;
	}

	public int setTenure(int tenure) {
		return this.tenure = tenure;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public int setCreditScore(int creditScore) {
		return this.creditScore = creditScore;
	}

	public double getRoi() {
		return roi;
	}

	public double setRoi(double roi) {
		return this.roi = roi;
	}

	public String getLoanType() {
		return loanType;
	}

	public String setLoanType(String loanType) {
		return this.loanType = loanType;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public String setLoanStatus(String loanStatus) {
		return this.loanStatus = loanStatus;
	}

}
