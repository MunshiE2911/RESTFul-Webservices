package com.munshi.rest.webservices.restfulwebservices.bean;

public class HelloWordBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWordBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWordBean [message=" + message + "]";
	}
	
	

}
