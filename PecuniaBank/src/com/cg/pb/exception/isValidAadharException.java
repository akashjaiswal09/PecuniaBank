package com.cg.pb.exception;

public class isValidAadharException extends Exception {
	String msg;
	public isValidAadharException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
