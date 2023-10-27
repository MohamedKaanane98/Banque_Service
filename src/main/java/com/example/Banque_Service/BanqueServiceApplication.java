package com.example.Banque_Service;

import com.example.Banque_Service.entities.BanqueAccount;
import com.example.Banque_Service.enums.AccountType;
import com.example.Banque_Service.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BanqueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueServiceApplication.class, args);

	}

	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository){
		return args -> {
			for (int i=0 ; i<10 ; i++){
				BanqueAccount banqueAccount = BanqueAccount.builder()
						.Id(UUID.randomUUID().toString())
						.type(Math.random()>0.5? AccountType.Current_Account:AccountType.Saving_Account)
						.Solde(10000+Math.random()*9000)
						.devise("MAD")
						.DateCreation(new Date())
						.build();
				bankAccountRepository.save(banqueAccount);
			}
		};
	}

}
