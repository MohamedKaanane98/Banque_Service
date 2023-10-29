package com.example.Banque_Service.entities;

import com.example.Banque_Service.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BanqueAccount.class , name = "p1")
public interface AccountProjection {
    public Integer getId();
    public AccountType getType();

}
