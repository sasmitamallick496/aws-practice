package com.amazonaws.lambda.demo;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<LambdaProxyRequest, LambdaProxyResponse> {

	@Override
	public LambdaProxyResponse handleRequest(LambdaProxyRequest input, Context context) {
		context.getLogger().log("input------"+input);
		Map<String, String> queryStringParameters = input.getQueryStringParameters();
		String nameValue = queryStringParameters.entrySet().stream().filter(e -> e.getKey().equals("name")).findFirst().get().getValue();
		LambdaProxyResponse lambdaResponse = new LambdaProxyResponse();
		lambdaResponse.setStatusCode(200);
		lambdaResponse.setBody("Hello "+nameValue+"This is Lambda with Proxy Integration");
		return lambdaResponse;
	}

}
