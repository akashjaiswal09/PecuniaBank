package com.cg.pb.dao;

import java.util.ArrayList;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.CustomerDAOImpl;

public class CustomerDAOImpl implements CustomerDAO {

	ArrayList<Customer> custList = new ArrayList<Customer>();

	@Override
	public void addCustomerDetails(Customer customer, Address address) {
		custList.add(customer);
	}

	@Override
	public void updateCustomerName(long accNo, String name) throws Exception {

		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if(x.getAccNo() == accNo) {
				x.getCustomer().setName(name);
				System.out.println("Customer Name Updated Successfully");
			}
			else {
				System.out.println("Account does not exist");
			}
		});
	}

	@Override
	public void updateCustomerContact(long accNo, long contact) {
		
		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if(x.getAccNo() == accNo) {
				x.getCustomer().setContact(contact);
				System.out.println("Customer Contact Updated Successfully");
			}
			else {
				System.out.println("Account does not exist");
			}
		});
	}

	@Override
	public void updateCustomerAddress(long accNo, Address address) {
		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if(x.getAccNo() == accNo) {
				x.setAddress(address);
				System.out.println("Customer Address Updated Successfully");
			}
			else {
				System.out.println("Account does not exist");
			}
		});
	}
}
	