package com.cg.pb.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService {

//	ArrayList<Account> accList = new ArrayList<Account>();
//	HashMap<Long, Account> accListHash = new HashMap<Long, Account>();

	AccountDAOImpl dao = new AccountDAOImpl();

	@Override
	public void addAccount() {
		dao.addAccount();
	}
	@Override
	public void addAccount(Account account, Customer customer, Address address) throws Exception {
		dao.addAccount(account, customer, address);
	}

	@Override
	public void udpateAccount() {
		dao.udpateAccount();

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
