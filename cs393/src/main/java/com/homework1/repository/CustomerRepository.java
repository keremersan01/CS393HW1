package com.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework1.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
