package com.example.Banque_Service.services;


import com.example.Banque_Service.DTO.BanqueAccountRequestDto;
import com.example.Banque_Service.DTO.BanqueAccountResponseDto;

public interface BankAccountService {
    BanqueAccountResponseDto addAccount (BanqueAccountRequestDto banqueAccountRequestDto);
}
