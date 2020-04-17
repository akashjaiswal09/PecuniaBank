package com.cg.pb.bean;

public class Customer {
	private String name; 
	public long contact;
	private long aadhar;
	private String DOB;
	private String PAN;
	private String gender;
	private Address address;
	
	public Customer() {
		
	}
	public Customer(String name, long contact, long aadhar, String dOB, String pAN, String gender, Address address) {
		super();
		this.name = name;
		this.contact = contact;
		this.aadhar = aadhar;
		DOB = dOB;
		PAN = pAN;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public long setContact(long contact) {
		return this.contact = contact;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getDOB() {
		return DOB;
	}
	public String setDOB(String dOB) {
		return DOB = dOB;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getGender() {
		return gender;
	}
	public String setGender(String gender) {
		return this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", aadhar=" + aadhar + ", DOB=" + DOB + ", PAN="
				+ PAN + ", gender=" + gender + "]";
	}
	
}
