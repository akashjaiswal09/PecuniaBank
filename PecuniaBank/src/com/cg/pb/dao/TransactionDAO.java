package com.cg.pb.dao;

import com.cg.pb.bean.Transaction;

public interface TransactionDAO {
	void addTransaction(long accNo,Transaction transaction);
	public void creditUsingSlip(long accNo, double amount);
	void debitUsingSlip(long accNo, double amount);
    void creditUsingCheque(long accNo, double amount);
	void debitUsingCheque(long accNo, double amount);
}

