package com.cg.pb.exception;

public class isValidContactException extends Exception {
	String msg;
	public isValidContactException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}

