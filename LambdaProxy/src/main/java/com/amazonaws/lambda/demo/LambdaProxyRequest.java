package com.amazonaws.lambda.demo;

import java.util.Map;

public class LambdaProxyRequest {
	
	private String resource;
	private String path;
	private String httpMethod;
	private Map<String, String> headers;
	private Map<String, String> queryStringParameters;
	private Map<String, String> pathParameters;
	private Map<String, String> stageVariables;
	private String body;
	private Boolean isBase64Encoded;
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getHttpMethod() {
		return httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public Map<String, String> getQueryStringParameters() {
		return queryStringParameters;
	}
	public void setQueryStringParameters(Map<String, String> queryStringParameters) {
		this.queryStringParameters = queryStringParameters;
	}
	public Map<String, String> getPathParameters() {
		return pathParameters;
	}
	public void setPathParameters(Map<String, String> pathParameters) {
		this.pathParameters = pathParameters;
	}
	public Map<String, String> getStageVariables() {
		return stageVariables;
	}
	public void setStageVariables(Map<String, String> stageVariables) {
		this.stageVariables = stageVariables;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Boolean getIsBase64Encoded() {
		return isBase64Encoded;
	}
	public void setIsBase64Encoded(Boolean isBase64Encoded) {
		this.isBase64Encoded = isBase64Encoded;
	}


}
