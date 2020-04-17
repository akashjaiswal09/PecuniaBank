package com.cg.pb.bean;

import java.time.LocalDate;

public class Transaction {
	private long accNo;
	private double amount;
	private String type;
	private double balance;
	private LocalDate date;
	public long getAccNo() {
		return accNo;
	}
	public long setAccNo(long accNo) {
		return this.accNo = accNo;
	}
	public double getAmount() {
		return amount;
	}
	public double setAmount(double amount) {
		return this.amount = amount;
		
	}
	public String getType() {
		return type;
	}
	public String setType(String type) {
		return this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public LocalDate setDate(LocalDate date) {
		return this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [accNo=" + accNo + ", amount=" + amount + ", type=" + type + ", balance=" + balance
				+ ", date=" + date + "]";
	}
	
	
	
}
