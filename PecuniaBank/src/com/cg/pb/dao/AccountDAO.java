package com.cg.pb.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public interface AccountDAO {
	void addAccount();
	void addAccount(Account account,Customer customer,Address address) throws Exception;
	void udpateAccount(Account account);
	void fetchAccount(long accNo);
	void deleteAccount(long accNo);
	HashMap<Long, Account> getaccListHash();
	ArrayList<Account> getaccList();
	void setAccListHash(HashMap<Long, Account> accListHash);
}
