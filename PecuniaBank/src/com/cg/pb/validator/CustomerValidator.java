package com.cg.pb.validator;

import com.cg.pb.bean.Customer;
import com.cg.pb.exception.*;

public class CustomerValidator {

	public void validate(Customer customer) throws Exception {

		isValidName(customer.getName());
		isValidContact(String.valueOf(customer.getContact()));
		isValidAadhar(String.valueOf(customer.getAadhar()));
		isValidDOB(customer.getDOB());
		isValidPAN(customer.getPAN());
		isValidGender(customer.getGender());

	}

	public static void isValidName(String name) throws isValidNameException {
		String pattern = "[A-Z]{1}[A-Za-z\\s]{2,}";
		if (!name.matches(pattern))
			throw new isValidNameException("first Letter Should be Capital");
	}

	public static void isValidContact(String contact) throws isValidContactException {
		String pattern = "[0-9]{10}";
		if (!contact.matches(pattern))
			throw new isValidContactException("10 digit numbers allowed");
	}

	public static void isValidAadhar(String aadhar) throws isValidAadharException {
		String pattern = "[0-9]{12}";
		if (!aadhar.matches(pattern))
			throw new isValidAadharException("12 digit number allowed");
	}

	public static void isValidDOB(String date) throws isValidDobException {
		String pattern = "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}";
		if (!date.matches(pattern))
			throw new isValidDobException("in DD/MM/YYYY format allowed");

	}

	public static void isValidPAN(String pan) throws isValidPanException {
		String pattern = "[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}";
		if (!pan.matches(pattern))
			throw new isValidPanException("Enter Correct PAN Detail");
	}

	public static void isValidGender(String gender) throws isValidGenderException {

		if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"))
			throw new isValidGenderException("Accept Male or Female only");
	}


}
