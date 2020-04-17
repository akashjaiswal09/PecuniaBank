package com.cg.pb.junit;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.cg.pb.bean.Transaction;

public class TransactionTesting {

	@Test
	public void test1() {
		long expected=1234;
		Transaction t= new Transaction();
		long actual = t.setAccNo(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test2() {
		long expected=1000;
		Transaction t= new Transaction();
		long actual = (long) t.setAmount(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test3() {
		long expected=10000;
		Transaction t= new Transaction();
		long actual = (long) t.setBalance(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test4() {
		String expected="Credited";
		Transaction t= new Transaction();
		String actual = t.setType(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test5() {
		LocalDate expected=LocalDate.of(2017, 1, 13);
		Transaction t= new Transaction();
		LocalDate actual = t.setDate(expected);
		assertEquals(expected, actual);	
	}
}
