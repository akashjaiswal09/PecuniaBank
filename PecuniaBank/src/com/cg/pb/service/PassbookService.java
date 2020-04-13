package com.cg.pb.service;

import java.time.LocalDate;

import com.cg.pb.bean.Transaction;

public interface PassbookService {
	
	public void storeTransaction(Transaction transaction);
	
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate);

	public void accountSummary(double accNo);

}