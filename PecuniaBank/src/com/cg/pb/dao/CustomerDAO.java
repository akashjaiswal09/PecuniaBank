package com.cg.pb.dao;


import com.cg.pb.bean.*;

public interface CustomerDAO {
	void addCustomerDetails(Customer customer,Address address) throws Exception;
	void updateCustomerName(long accNo, String name) throws Exception;
	void updateCustomerContact(long accNo, long contact);
	void updateCustomerAddress(long accNo,Address address);
}
