package com.homework1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework1.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
