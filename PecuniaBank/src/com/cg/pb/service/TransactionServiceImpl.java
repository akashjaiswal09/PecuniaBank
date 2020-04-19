package com.cg.pb.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.bean.Transaction;
import com.cg.pb.dao.TransactionDAOImpl;

public class TransactionServiceImpl implements TransactionService {


	TransactionDAOImpl dao = new TransactionDAOImpl();

	@Override
	public void addTransaction(long accNo, Transaction transaction) {
		dao.addTransaction(accNo, transaction);
	}

	@Override
	public void creditUsingSlip(long accNo, double amount) {
		dao.creditUsingSlip(accNo, amount);

	}

	@Override
	public void debitUsingSlip(long accNo, double amount) {
		dao.debitUsingSlip(accNo, amount);
	}

	@Override
	public void creditUsingCheque(long accNo, double amount) {
		dao.creditUsingCheque(accNo, amount);
	}

	@Override
	public void debitUsingCheque(long accNo, double amount) {
		dao.debitUsingCheque(accNo, amount);

	}

}
