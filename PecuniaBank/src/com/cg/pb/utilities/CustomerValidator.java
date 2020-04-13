package com.cg.pb.utilities;

import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;

public class CustomerValidator {

	public void validate(Customer customer) throws Exception {

		isValidName(customer.getName());
//		isValidContact(customer.getContact());
//		isValidAadhar(customer.getAadhar());
		isValidDOB(customer.getDOB());
		isValidPAN(customer.getPAN());
		isValidGender(customer.getGender());
		isValidAddress(customer.getAddress());

	}

	public static boolean isValidName(String name) {
		String pattern = "[A-Z]{1}[a-z]{2,6}";
		if (name.matches(pattern))
			return true;
		else
			return false;

	}

	public static boolean isValidContact(String contact) {
		String pattern = "[0-9]{10}";
		if (contact.matches(pattern))
			return true;
		else
			return false;
	}

	public static boolean isValidAadhar(String aadhar) {
		String pattern = "[0-9]{12}";
		if (aadhar.matches(pattern))
			return true;
		else
			return false;
	}

	public static boolean isValidDOB(String date) {
		String pattern = "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}";
		if (date.matches(pattern))
			return true;
		else
			return false;

	}

	public static boolean isValidPAN(String pan) {
		String pattern = "[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}";
		if (pan.matches(pattern))
			return true;
		else
			return false;
	}

	public static boolean isValidGender(String gender) {
		return false;
	}

	public void isValidAddress(Address address) {
		// TODO Auto-generated method stub

	}

	public void isValidSalary(Integer salary) throws Exception {
//		if(salary==0)
//			throw new InvalidSalaryException("salary should not be zero");

	}

}
