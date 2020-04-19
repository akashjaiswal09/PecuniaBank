package com.cg.pb.service;


import com.cg.pb.bean.*;

public interface CustomerService {
	void addCustomerDetails(Customer customer,Address address) throws Exception;
	void updateCustomerName(long accNo, String name) throws Exception;
	void updateCustomerContact(long accNo, long contact);
	void updateCustomerAddress(long accNo,Address address);
}
