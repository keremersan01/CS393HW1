package com.homework1.service;

import java.util.List;

import com.homework1.model.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	public Customer save(Customer customer);
	public long customerCount();
	public void delete(long id);
	public Customer findById(long id);
	
	
}
