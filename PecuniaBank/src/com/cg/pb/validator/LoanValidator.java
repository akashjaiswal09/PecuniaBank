package com.cg.pb.validator;

import com.cg.pb.bean.Loan;
import com.cg.pb.exception.isValidAccNoException;
import com.cg.pb.exception.isValidAmountException;
import com.cg.pb.exception.isValidCreditScoreException;
import com.cg.pb.exception.isValidLoanStatusException;
import com.cg.pb.exception.isValidLoanTypeException;
import com.cg.pb.exception.isValidRoiException;
import com.cg.pb.exception.isValidTenureException;

public class LoanValidator {
	public void validate(Loan loan) throws Exception {
//		  creditScore, roi, loanType, loanStatus;

		isValidAccNo(String.valueOf(loan.getAccNo()));
		isValidAmount(loan.getAmount());
		isValidTenure(loan.getTenure());
		isValidCreditScore(loan.getCreditScore());
		isValidRoi(loan.getRoi());
		isValidLoanType(loan.getLoanType());
		isValidLoanStatus(loan.getLoanStatus());
	}

	public static void isValidAccNo(String accNo) throws isValidAccNoException {
		String pattern = "[0-9]{12}";
		if (!accNo.matches(pattern))
			throw new isValidAccNoException("12 digit account number allowed");
	}

	public static void isValidAmount(long amount) throws isValidAmountException {
		if (amount < 1000 || amount > 10000000)
			throw new isValidAmountException("Should only contain Numeric & amount must be between 100-100000");
	}
	public static void isValidTenure(int tenure) throws isValidTenureException {
		if (tenure < 12 || tenure > 240)
			throw new isValidTenureException("Accepts only positive numeric value and must be between 12 and 240. (Months) ");
	}
	public static void isValidCreditScore(int creditScore) throws isValidCreditScoreException {
		if (creditScore < 100 || creditScore > 999)
			throw new isValidCreditScoreException("Accepts only positive numeric value must be between 100 & 999");
	}
	public static void isValidRoi(int roi) throws isValidRoiException {
		if (roi < 4 || roi > 15)
			throw new isValidRoiException("Accepts only positive integer value and must be between 4 and 15");
	}
	public static void isValidLoanType(String loanType) throws isValidLoanTypeException {
		if (!loanType.equals("Personal") && !loanType.equals("House") && !loanType.equals("Car"))
			throw new isValidLoanTypeException("Accepts only Personal or House or Car");
	}
	public static void isValidLoanStatus(String loanStatus) throws isValidLoanStatusException {
		if (!loanStatus.equals("Request"))
			throw new isValidLoanStatusException("Accepts only Request");
	}
}
