package com.provilac.exception;

public class InValidBrowserException extends Exception {

	
	
	private String msg;
	
	public InValidBrowserException(String browserName) {
		this.msg="Invalid Browser Exception "+browserName;
	}
	
	
	@Override
	public String toString() {
		return msg;
	}

}
