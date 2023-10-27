package com.example.Banque_Service.entities;

import com.example.Banque_Service.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BanqueAccount {
    @Id
    private String Id;
    private Date DateCreation;
    private double Solde;
    private String devise;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
