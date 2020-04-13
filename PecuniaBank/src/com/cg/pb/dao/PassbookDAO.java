package com.cg.pb.dao;

import java.time.LocalDate;

import com.cg.pb.bean.Transaction;

public interface PassbookDAO {
	
	public void storeTransaction(Transaction transaction);
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate);
	public void accountSummary(double accNo);

}