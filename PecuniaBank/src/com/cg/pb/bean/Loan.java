package com.cg.pb.bean;

public class Loan {
	long accNo;
	long amount;
	int tenure;
	int creditScore;
	int roi;
	String loanType;
	String loanStatus;

	public long getAccNo() {
		return accNo;
	}

	public long setAccNo(long accNo) {
		return this.accNo = accNo;
	}

	public long getAmount() {
		return amount;
	}

	public long setAmount(long amount) {
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

	public int getRoi() {
		return roi;
	}

	public int setRoi(int roi) {
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

	@Override
	public String toString() {
		return "Loan [accNo=" + accNo + ", amount=" + amount + ", tenure=" + tenure + ", creditScore=" + creditScore
				+ ", roi=" + roi + ", loanType=" + loanType + ", loanStatus=" + loanStatus + "]";
	}
	

}
