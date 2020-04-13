package com.cg.pb.service;

import java.time.LocalDate;

import com.cg.pb.bean.Transaction;
import com.cg.pb.dao.PassbookDAOImpl;

public class PassbookServiceImpl implements PassbookService {
	
	PassbookDAOImpl dao = new PassbookDAOImpl();
	
	@Override
	public void storeTransaction(Transaction transaction) {
		dao.storeTransaction(transaction);
		
	}

	@Override
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate) {
		dao.accountSummary(accNo, startdate, enddate);
	}

	@Override
	public void accountSummary(double accNo) {
		dao.accountSummary(accNo);
		
	}

	

}