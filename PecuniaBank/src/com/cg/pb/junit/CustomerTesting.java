package com.cg.pb.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Customer;

public class CustomerTesting {

	@Test
	public void test1() {
		String expected="09/08/1995";
		Customer c= new Customer();
		String actual = c.setDOB(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test2() {
		long expected=965454966;
		Customer c= new Customer();
		long actual = c.setContact(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test3() {
		String expected="Akash";
		Customer c= new Customer();
		String actual = c.setName(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test4() {
		String expected="Male";
		Customer c= new Customer();
		String actual = c.setGender(expected);
		assertEquals(expected, actual);	
	}
	

}
