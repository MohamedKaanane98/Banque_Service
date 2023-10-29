package com.example.Banque_Service.DTO;

import com.example.Banque_Service.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor  @Builder
public class BanqueAccountResponseDto {
    private Integer Id;
    private Date DateCreation;
    private Double Solde;
    private String devise;
    private AccountType type;
}
