package com.cg.pb.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.bean.Transaction;

public class AccountTesting {
	
	@Test
	public void test1() {
		long expected=1234123412;
		Account a= new Account();
		long actual = a.setAccNo(1234123412);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test2() {
		long expected=10000;
		Account a= new Account();
		long actual = (long) a.setBalance(10000);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		Address actual=new Address("0346c","buxipur","Gorakhpur","UttarPradesh","273001");
		Account a= new Account();
		Address expected =a.setAddress(actual);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
		String expected="Savings";
		Account a= new Account();
		String actual = a.setAccType(expected);
		assertEquals(expected, actual);	
	}
	

}
