package com.amazonaws.lambda.demo;

import java.util.Date;
import java.util.UUID;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<MyLambdaRequest, MyLambdaResponse> {

	@Override
	public MyLambdaResponse handleRequest(MyLambdaRequest input, Context context) {
		System.out.println("Context----------"+context);
		context.getLogger().log("Input--"+input);
		MyLambdaResponse lambdaResponse = new MyLambdaResponse();
		try {
			lambdaResponse.setResponseMessage("Hello "+input.getName()+" with Id - "+input.getId()+ " Response time "+ new Date());
			lambdaResponse.setTransactionId(UUID.randomUUID().toString());
		}catch(Exception e) {
			e.printStackTrace();
			lambdaResponse.setResponseMessage(e.getMessage());
		}
		context.getLogger().log("Response "+ lambdaResponse);
		return lambdaResponse;
	}

   
}
