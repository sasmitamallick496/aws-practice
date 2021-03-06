package com.sasmita.aws.lambda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sasmita.aws.lambda.entity.Customer;
import com.sasmita.aws.lambda.repository.CustomerDao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class CustomerService {
	
	private CustomerDao dao;
	
	public List<Customer> getAllCustomers(){
		return getDao().createCustomers();
		
	}

}
