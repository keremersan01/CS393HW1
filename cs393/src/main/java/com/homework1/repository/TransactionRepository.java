package com.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework1.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
