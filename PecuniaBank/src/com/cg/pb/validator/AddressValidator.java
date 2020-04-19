package com.cg.pb.validator;

import com.cg.pb.bean.Address;
import com.cg.pb.exception.*;

public class AddressValidator {
	
	public void validate(Address address) throws Exception {
	
		isValidAddressline(address.getAddressline1());
		isValidAddressline(address.getAddressline2());
		isValidCity(address.getCity());
		isValidState(address.getState());
		isValidZipcode(address.getZipcode());
	}

	
	public static void isValidAddressline(String addressline) throws isValidAddresslineException {
		String pattern = "[A-Za-z0-9,\\s-]{1,}";
		if (!addressline.matches(pattern))
			throw new isValidAddresslineException("alphanumeric allowed");
	}
	public static void isValidCity(String city) throws isValidCityException {
		String pattern = "[A-Za-z\\s]{1,}";
		if (!city.matches(pattern))
			throw new isValidCityException("Alphabet only");
	}
	public static void isValidState(String state) throws isValidStateException {
		String pattern = "[A-Za-z\\s]{1,}";
		if (!state.matches(pattern))
			throw new isValidStateException("Alphabet only");
	}
	public static void isValidZipcode(String zipcode) throws isValidZipcodeException {
		String pattern = "[0-9]{6}";
		if (!zipcode.matches(pattern))
			throw new isValidZipcodeException("Enter Valid Zipcode");
	}

}
