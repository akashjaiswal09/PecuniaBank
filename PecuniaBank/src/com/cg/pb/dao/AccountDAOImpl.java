package com.cg.pb.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class AccountDAOImpl implements AccountDAO {

	public static ArrayList<Account> accList = new ArrayList<Account>();
	public static HashMap<Long, Account> accListHash = new HashMap<Long, Account>();
	Address address=new Address("0346c","buxipur","Gorakhpur","UttarPradesh","273001");
	Customer customer = new Customer("Akash",965454966, 1234, "09081997","BHTPJ6541E","Male", address);
	Account a1= new Account("null",123,"null",10000,customer,address,1234);

	@Override
	public void addAccount() {
		accList.add(a1);
		accListHash.put(a1.getAccNo(), a1);
	}
	
	@Override
	public void addAccount(Account account, Customer customer, Address address) throws Exception {
		accList.add(account);
		accListHash.put(account.getAccNo(), account);
		

	}

	@Override
	public void udpateAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchAccount(long accNo) {
		for (long i : accListHash.keySet()) {
			if (i == accNo) {
				System.out.println(accListHash.get(i));
			}
		}
	}

	@Override
	public void deleteAccount(long accNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public HashMap<Long, Account> getaccListHash() {
		return AccountDAOImpl.accListHash;
	}

	@Override
	public ArrayList<Account> getaccList() {
		return AccountDAOImpl.accList;
	}

	@Override
	public void setAccListHash(HashMap<Long, Account> accListHash) {
		AccountDAOImpl.accListHash = accListHash;
	}

}
