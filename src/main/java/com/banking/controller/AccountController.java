package com.banking.controller;

import com.banking.model.Account;
import com.banking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value = "accounts", method = RequestMethod.POST)
    public ResponseEntity<Void> create(@RequestBody AccountInput accountInput) {
        Account account = new Account();
        account.setName(accountInput.getName());

        accountRepository.save(account);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
