package com.cg.pb.bean;

import java.util.HashMap;

public class Account {
	String accId;
	int branchId;
	String type;
	double balance;
	Customer customer;
	Address address;
	long accNo;

	public Account() {
		
	}

	public Account(String accId, int branchId, String type, double balance, Customer customer, Address address,
			long accNo) {
		super();
		this.accId = accId;
		this.branchId = branchId;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
		this.address = address;
		this.accNo = accNo;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", branchId=" + branchId + ", type=" + type + ", balance=" + balance
				+ ", \ncustomer=" + customer + ", \naddress=" + address + ", \naccNo=" + accNo + "]";
	}

}
