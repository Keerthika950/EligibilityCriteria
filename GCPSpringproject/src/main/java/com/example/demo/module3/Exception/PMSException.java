package com.example.demo.module3.Exception;

public class PMSException {
	private String errorMessage;
	private int errorCode;
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	@Override
	public String toString() {
		return "ExceptionResponse [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	public PMSException(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
	public PMSException() {
		super();
	}
	

}
