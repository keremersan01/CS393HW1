package com.homework1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework1.model.Customer;
import com.homework1.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public long customerCount() {

		return customerRepository.count();
	}

	@Override
	public void delete(long id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer findById(long id) {
		return customerRepository.getById(id);
	}

}
