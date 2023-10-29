package com.example.Banque_Service.services;

import com.example.Banque_Service.DTO.BanqueAccountRequestDto;
import com.example.Banque_Service.DTO.BanqueAccountResponseDto;
import com.example.Banque_Service.entities.BanqueAccount;
import com.example.Banque_Service.mappers.AccountMapper;
import com.example.Banque_Service.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service @Transactional
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public BanqueAccountResponseDto addAccount(BanqueAccountRequestDto banqueAccountRequestDto) {
        BanqueAccount banqueAccount = new BanqueAccount().builder()
                .type(banqueAccountRequestDto.getType())
                .Solde(banqueAccountRequestDto.getSolde())
                .devise(banqueAccountRequestDto.getDevise())
                .DateCreation(new Date())
                .build();
        BanqueAccount savedBankAccount =bankAccountRepository.save(banqueAccount);
        BanqueAccountResponseDto banqueAccountResponseDto = accountMapper.fromBankAccount(savedBankAccount);
        return banqueAccountResponseDto;
    }
}
