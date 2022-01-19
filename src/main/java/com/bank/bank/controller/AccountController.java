package com.bank.bank.controller;


import com.bank.bank.model.Account;
import com.bank.bank.repository.AccountRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/accounts")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @PutMapping
    public Account updateAccountById(@RequestBody Account newAccount){
        return accountRepository.save(newAccount);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account newAccount){
        Account account = accountRepository.save(newAccount);
        return account;
    }


}
