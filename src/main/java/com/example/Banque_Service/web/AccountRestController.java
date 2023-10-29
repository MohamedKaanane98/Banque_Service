package com.example.Banque_Service.web;

import com.example.Banque_Service.DTO.BanqueAccountRequestDto;
import com.example.Banque_Service.DTO.BanqueAccountResponseDto;
import com.example.Banque_Service.entities.BanqueAccount;
import com.example.Banque_Service.mappers.AccountMapper;
import com.example.Banque_Service.repositories.BankAccountRepository;
import com.example.Banque_Service.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Api")
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private BankAccountService bankAccountService;

    @Autowired
    private AccountMapper accountMapper;
    @GetMapping("/BankAccounts")
    public List<BanqueAccount> banqueAccounts() {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/BankAccounts/{id}")
    public BanqueAccount banqueAccount(@PathVariable Integer id) {
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }

    @PostMapping("/BankAccounts")
    public BanqueAccountResponseDto save (@RequestBody BanqueAccountRequestDto b){
        return bankAccountService.addAccount(b);
    }

    @PutMapping("/BankAccounts/{id}")
    public BanqueAccount Update(@PathVariable Integer id , @RequestBody BanqueAccount b){
        BanqueAccount Account = bankAccountRepository.findById(id).orElseThrow();
        if(b.getSolde()!=null) Account.setSolde(b.getSolde());
        if(b.getDevise()!=null) Account.setDevise(b.getDevise());
        if(b.getType()!=null) Account.setType(b.getType());
        if(b.getDateCreation()!=null) Account.setDateCreation(new Date());
        return bankAccountRepository.save(Account);
    }

    @DeleteMapping("/BankAccounts/{id}")
    public void delete (@PathVariable Integer id) {
       bankAccountRepository.deleteById(id);
    }
}
