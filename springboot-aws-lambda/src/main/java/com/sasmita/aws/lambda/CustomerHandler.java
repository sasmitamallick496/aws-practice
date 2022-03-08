package com.sasmita.aws.lambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;


public class CustomerHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, Object> {

}
