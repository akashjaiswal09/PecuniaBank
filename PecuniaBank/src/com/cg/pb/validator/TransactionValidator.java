package com.cg.pb.validator;

import com.cg.pb.exception.isValidAccNoException;
import com.cg.pb.exception.isValidAmountException;
import com.cg.pb.exception.isValidChequeNoException;
import com.cg.pb.exception.isValidIfscException;

public class TransactionValidator{
	
	public static void isValidAccNo(String accNo) throws isValidAccNoException {
		String pattern = "[0-9]{12}";
		if (!accNo.matches(pattern))
			throw new isValidAccNoException("Should be of 12 digits only.");
	}
	public static void isValidAmount(long amount) throws isValidAmountException {
		String pattern = "[0-9]{2.5}";
		if (amount<100 && amount>100000)
			throw new isValidAmountException("Should only contain Numeric & amount must be between 100-100000");
	}
	public static void isValidChequeNo(String chequeNo) throws isValidChequeNoException {
		String pattern = "[0-9]{6}";
		if (!chequeNo.matches(pattern))
			throw new isValidChequeNoException("Should be of 6 digits only.");
	}
	public static void isValidIfsc(String ifsc) throws isValidIfscException {
		String pattern = "[A-Za-z0-9]{10}";
		if (!ifsc.matches(pattern))
			throw new isValidIfscException("Should be alphanumeric and 10 characters only.");
	}

}
