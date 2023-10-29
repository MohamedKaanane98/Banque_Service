package com.example.Banque_Service.DTO;

import com.example.Banque_Service.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BanqueAccountRequestDto {
    private Double Solde;
    private String devise;
    private AccountType type;
}
