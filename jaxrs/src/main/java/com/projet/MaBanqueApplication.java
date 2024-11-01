package com.projet;

import com.projet.entities.Compte;
import com.projet.entities.TypeCompte;
import com.projet.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MaBanqueApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaBanqueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {

        return args -> {
            compteRepository.save(new Compte(1L, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(2L, Math.random() * 9000, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(3L, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));

            compteRepository.findAll().forEach(c -> System.out.println(c.toString()));
        };
    }

}
