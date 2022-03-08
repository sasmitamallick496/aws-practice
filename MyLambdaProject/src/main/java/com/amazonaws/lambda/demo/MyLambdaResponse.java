package com.amazonaws.lambda.demo;

public class MyLambdaResponse {
	
	private String responseMessage;
	private String transactionId;
	
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "MyLambdaResponse [responseMessage=" + responseMessage + "]";
	}
}
