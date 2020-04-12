package com.cg.pb.dao;

import java.time.LocalDate;

public interface PassbookDAO {

	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate);
	public void accountSummary(double accNo);

}