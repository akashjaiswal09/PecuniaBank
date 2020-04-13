package com.cg.pb.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.Transaction;

public class PassbookDAOImpl implements PassbookDAO {

	ArrayList<Transaction> passbookList = new ArrayList<Transaction>();
	HashMap<Long, Transaction> passbookListHash = new HashMap<Long, Transaction>();

	@Override
	public void storeTransaction(Transaction transaction) {
		passbookList.add(transaction);
		passbookListHash.put(transaction.getAccNo(), transaction);
	}

	@Override
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate) {

	}

	@Override
	public void accountSummary(double accNo) {
		passbookList.stream().filter(x -> x.getAccNo() == accNo).forEach(System.out::println);

	}

}