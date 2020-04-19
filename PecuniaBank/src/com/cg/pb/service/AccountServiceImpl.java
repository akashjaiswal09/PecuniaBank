package com.cg.pb.service;

import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.AccountDAOImpl;
import com.cg.pb.validator.AccountValidator;
import com.cg.pb.validator.AddressValidator;
import com.cg.pb.validator.CustomerValidator;

public class AccountServiceImpl implements AccountService {

	AccountValidator validator = new AccountValidator();
	CustomerValidator validator1 = new CustomerValidator();
	AddressValidator validator2 = new AddressValidator();
	AccountDAOImpl dao = new AccountDAOImpl();

	@Override
	public void addAccount() {
		dao.addAccount();
	}
	@Override
	public void addAccount(Account account, Customer customer, Address address) throws Exception {
		validator.validate(account);
		validator1.validate(customer);
		validator2.validate(address);
		dao.addAccount(account, customer, address);
	}

	@Override
	public void fetchAccount(long accNo) {
		dao.fetchAccount(accNo);
	}

	@Override
	public void deleteAccount(long accNo) {
		dao.deleteAccount(accNo);

	}

	@Override
	public void getaccListHash() {
		dao.getaccListHash();
	}

	@Override
	public void getaccList() {
		dao.getaccList();
	}
	@Override
	public void setAccListHash(HashMap<Long, Account> accListHash) {
		dao.setAccListHash(accListHash);
	}

}
