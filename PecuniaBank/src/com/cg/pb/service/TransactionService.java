package com.cg.pb.service;

import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.bean.Transaction;

public interface TransactionService {
	
	void addTransaction(long accNo, Transaction transaction);

	public void creditUsingSlip(long accNo, double amount);

	void debitUsingSlip(long accNo, double amount);

	void creditUsingCheque(long accNo, double amount);

	void debitUsingCheque(long accNo, double amount);
}
