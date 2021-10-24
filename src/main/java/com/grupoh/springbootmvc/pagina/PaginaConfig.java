package com.grupoh.springbootmvc.pagina;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PaginaConfig {

    @Bean
    CommandLineRunner commandLineRunner(PaginaRepository paginaRepository) {
        return args -> {
            Pagina alvaro = new Pagina(
                    "Alvaro"
            );
            Pagina pablo = new Pagina(
                    "Pablo"
            );
            Pagina manuel = new Pagina(
                    "Manuel"
            );
            Pagina david = new Pagina(
                    "David"
            );

            paginaRepository.saveAll(
                    List.of(alvaro,pablo,manuel,david)
            );

        };
    }

}
