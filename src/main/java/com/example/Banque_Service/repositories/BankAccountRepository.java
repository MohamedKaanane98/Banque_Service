package com.example.Banque_Service.repositories;

import com.example.Banque_Service.entities.BanqueAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BanqueAccount,String> {

}
