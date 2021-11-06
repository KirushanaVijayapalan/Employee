package com.codeulagam.springboot.demo;

public enum ResponseStatus {
	
SUCCESS(2000,"success");

	private int Code;
	private String Status;
	private ResponseStatus(int code, String status) {
		Code = code;
		Status = status;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
