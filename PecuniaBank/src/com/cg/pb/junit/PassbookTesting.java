package com.cg.pb.junit;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.cg.pb.bean.Passbook;

public class PassbookTesting {

	@Test
	public void test1() {
		long expected=1234;
		Passbook p= new Passbook();
		long actual = p.setAccNo(expected);
		assertEquals(expected, actual);	
	}
	
	@Test
	public void test2() {
		long expected=1000;
		Passbook p= new Passbook();
		long actual = (long) p.setAmount(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test3() {
		long expected=10000;
		Passbook p= new Passbook();
		long actual = (long) p.setBalance(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test4() {
		String expected="Credited";
		Passbook p= new Passbook();
		String actual = p.setType(expected);
		assertEquals(expected, actual);	
	}
	@Test
	public void test5() {
		LocalDate expected=LocalDate.of(2017, 1, 13);
		Passbook p= new Passbook();
		LocalDate actual = p.setDate(expected);
		assertEquals(expected, actual);	
	}
}
