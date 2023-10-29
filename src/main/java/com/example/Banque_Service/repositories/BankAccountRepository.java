package com.example.Banque_Service.repositories;

import com.example.Banque_Service.entities.BanqueAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BanqueAccount,Integer> {

}
