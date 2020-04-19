package com.cg.pb.service;

import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public interface AccountService {
	void addAccount();
	void addAccount(Account account,Customer customer,Address address) throws Exception;
	void fetchAccount(long accNo);
	void deleteAccount(long accNo);
	void getaccListHash();
	void getaccList();
	void setAccListHash(HashMap<Long, Account> accListHash);
}
