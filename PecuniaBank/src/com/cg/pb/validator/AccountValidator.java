package com.cg.pb.validator;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.exception.isValidAccNoException;
import com.cg.pb.exception.isValidAccTypeException;
import com.cg.pb.exception.isValidAddresslineException;
import com.cg.pb.exception.isValidBalanceException;
import com.cg.pb.exception.isValidBranchIdException;

public class AccountValidator {

	public void validate(Account account) throws Exception {

		isValidAccNo(String.valueOf((account.getAccNo())));
		isValidBranchId(String.valueOf(account.getBranchId()));
		isValidAccType(account.getAccType());
		isValidBalance(account.getBalance());	

	}
	public static void isValidAccNo(String accNo) throws isValidAccNoException {
		String pattern = "[0-9]{12}";
		if (!accNo.matches(pattern))
			throw new isValidAccNoException("12 digit account number allowed");
	}
	public static void isValidBranchId(String branchId) throws isValidBranchIdException {
		String pattern = "[0-9]{5}";
		if (!branchId.matches(pattern))
			throw new isValidBranchIdException("5 digit branch id allowed");
	}
	public static void isValidAccType(String accType) throws isValidAccTypeException {
		String pattern = "[A-Za-z]{1,}";
		if (!accType.equalsIgnoreCase("Savings") && !accType.equalsIgnoreCase("Current"))
			throw new isValidAccTypeException("Accept Savings or Current only");
	}
	public static void isValidBalance(double balance) throws isValidBalanceException {
		if (balance<1000)
			throw new isValidBalanceException("balance should be more than 1000");
	}

}
