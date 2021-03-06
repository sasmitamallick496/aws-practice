package com.sasmita.aws.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.sasmita.aws.lambda.entity.Customer;

@Repository
public class CustomerDao {

	public List<Customer> createCustomers() {

		return Stream.of(new Customer(111, "Sasmita Mallick", "sas@gmail.com"),
				new Customer(222, "Amyra Damania", "amy@gmail.com"),
				new Customer(333, "Kiaan Damania", "kinu@gmail.com")).collect(Collectors.toList());

	}

}
