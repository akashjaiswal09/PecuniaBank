package com.cg.pb.exception;

public class isValidNameException extends Exception {
	String msg;
	public isValidNameException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}