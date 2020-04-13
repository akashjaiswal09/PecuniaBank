package com.cg.pb.bean;

import java.time.LocalDate;

public class Passbook {
	private long accNo;
	private double amount;
	private String type;
	private double balance;
	private LocalDate date;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Passbook [accNo=" + accNo + ", amount=" + amount + ", type=" + type + ", balance=" + balance + ", date="
				+ date + "]";
	}
	
	
	
	
}
