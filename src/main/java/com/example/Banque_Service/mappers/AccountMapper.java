package com.example.Banque_Service.mappers;

import com.example.Banque_Service.DTO.BanqueAccountRequestDto;
import com.example.Banque_Service.DTO.BanqueAccountResponseDto;
import com.example.Banque_Service.entities.BanqueAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BanqueAccountResponseDto fromBankAccount(BanqueAccount banqueAccount){
        BanqueAccountResponseDto banqueAccountResponseDto = new BanqueAccountResponseDto();
        BeanUtils.copyProperties(banqueAccount,banqueAccountResponseDto);
        return banqueAccountResponseDto;
    }
}
