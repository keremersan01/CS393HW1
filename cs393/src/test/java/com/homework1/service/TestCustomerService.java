package com.homework1.service;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.homework1.model.Customer;

@SpringBootTest
class TestCustomerService {
	
	@Autowired
	CustomerService customerService;

	@Test
	public void testCustomerService()
	{
		Customer customer = new Customer();
		customer.setFirstName("Kerem");
		customer.setLastName("Ersan");
		System.out.println("Number of customers: " + customerService.customerCount());
		customerService.save(customer);
		System.out.println("Number of customers: " + customerService.customerCount());
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = customerService.findAll();
		for (Customer c : customerList) {
			System.out.println(c);
		}
		
	}

}
