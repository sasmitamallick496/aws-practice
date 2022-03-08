package com.sasmita.aws.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.sasmita.aws.lambda.entity.Customer;
import com.sasmita.aws.lambda.service.CustomerService;

import lombok.AllArgsConstructor;
import lombok.Data;

@SpringBootApplication
@Data
@AllArgsConstructor
public class SpringbootAwsLambdaApplication {

	private CustomerService service;

	@Bean
	public Supplier<List<Customer>> getAllCustomer() {
		return () -> getService().getAllCustomers();
	}

	@Bean
	public Function<APIGatewayProxyRequestEvent, Customer> findCustomerByName() {

		return requestEvent -> getService().getAllCustomers().stream().filter(
				customer -> customer.getName().equals(requestEvent.getQueryStringParameters().get("customerName")))
				.findFirst().get();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsLambdaApplication.class, args);
	}

}
