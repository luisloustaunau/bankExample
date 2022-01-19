package com.bank.bank.repository;

import com.bank.bank.model.Account;
import com.bank.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {



    }
