package com.example.Banque_Service.web;

import com.example.Banque_Service.entities.BanqueAccount;
import com.example.Banque_Service.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @GetMapping("/BankAccounts")
    public List<BanqueAccount> banqueAccounts() {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/BankAccounts/{id}")
    public BanqueAccount banqueAccount(@PathVariable String id) {
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
}
