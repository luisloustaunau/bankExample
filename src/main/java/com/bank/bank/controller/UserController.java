package com.bank.bank.controller;


import com.bank.bank.model.Account;
import com.bank.bank.model.Customer;
import com.bank.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    CustomerRepository userRepository;


    @GetMapping("/{id}")
    public ResponseEntity<?> getUser (@PathVariable int id){
        return ResponseEntity.ok(userRepository.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
        List<Account> accounts = new ArrayList<>();
        Account newAccount = new Account(0, true, false, false);
        accounts.add(newAccount);
        customer.setAccounts(accounts);
        return ResponseEntity.ok(userRepository.save(customer));
    }




}
