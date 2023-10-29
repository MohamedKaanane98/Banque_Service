package com.example.Banque_Service.entities;

import com.example.Banque_Service.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BanqueAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Date DateCreation;
    private Double Solde;
    private String devise;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
