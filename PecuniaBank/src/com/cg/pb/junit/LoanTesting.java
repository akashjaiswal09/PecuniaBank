package com.cg.pb.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.pb.bean.Loan;
import com.cg.pb.bean.Passbook;

public class LoanTesting {

	@Test
	public void test1() {
		long expected=1234;
		Loan l= new Loan();
		long actual = l.setAccNo(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test2() {
		int expected=300;
		Loan l= new Loan();
		long actual = l.setCreditScore(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test3() {
		int expected=3;
		Loan l= new Loan();
		int actual = l.setTenure(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test4() {
		long expected=10000;
		Loan l= new Loan();
		long actual = (long) l.setAmount(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test5() {
		String expected="Active";
		Loan l= new Loan();
		String actual = l.setLoanStatus(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test6() {
		String expected="Home";
		Loan l= new Loan();
		String actual = l.setLoanType(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test7() {
		long expected=(long) 8.5;
		Loan l= new Loan();
		long actual = (long) l.setRoi(expected);
		assertEquals(expected, actual);	
	}
}
