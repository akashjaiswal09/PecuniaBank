package com.cg.pb.service;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.CustomerDAOImpl;
import com.cg.pb.validator.CustomerValidator;


public class CustomerServiceImpl implements CustomerService{
	CustomerValidator validator=new CustomerValidator();
	CustomerDAOImpl dao = new CustomerDAOImpl();

	@Override
	public void addCustomerDetails(Customer customer, Address address) throws Exception {
		validator.validate(customer);
		dao.addCustomerDetails(customer, address);
	}

	@Override
	public void updateCustomerName(long accNo, String name) throws Exception {
		dao.updateCustomerName(accNo, name);
		
	}

	@Override
	public void updateCustomerContact(long accNo, long contact) {
		dao.updateCustomerContact(accNo, contact);
	}

	@Override
	public void updateCustomerAddress(long accNo, Address address) {
		dao.updateCustomerAddress(accNo, address);
		
	}
}