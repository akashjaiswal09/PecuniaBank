package com.cg.pb.bean;

import java.util.HashMap;

public class Account {
	long accNo;
	int branchId;
	String accType;
	double balance;
	Customer customer;
	Address address;
	public Account(long accNo, int branchId, String accType, double balance, Customer customer, Address address) {
		super();
		this.accNo = accNo;
		this.branchId = branchId;
		this.accType = accType;
		this.balance = balance;
		this.customer = customer;
		this.address = address;
	}
	public Account() {
		
	}
	public long getAccNo() {
		return accNo;
	}
	public long setAccNo(long accNo) {
		return this.accNo = accNo;
	}
	public int getBranchId() {
		return branchId;
	}
	public int setBranchId(int branchId) {
		return this.branchId = branchId;
	}
	public String getAccType() {
		return accType;
	}
	public String setAccType(String accType) {
		return this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		return this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Customer setCustomer(Customer customer) {
		return this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public Address setAddress(Address address) {
		return this.address = address;
	}
	@Override
	public String toString() {
		return "Account=[accNo=" + accNo + ", branchId=" + branchId + ", accType=" + accType + ", balance=" + balance+"]"
				+ ",\ncustomer=" + customer + ",\naddress=" + address;
	}
	
	

}
