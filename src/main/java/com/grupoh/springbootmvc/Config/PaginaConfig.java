package com.grupoh.springbootmvc.Config;

import com.github.javafaker.Faker;
import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Repository.PaginaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Locale;

@Configuration
public class PaginaConfig {

    @Bean
    CommandLineRunner commandLineRunner(PaginaRepository paginaRepository) {

        Faker faker = new Faker(new Locale("es"));

        Pagina uno = new Pagina(
                faker.animal().name(),
                faker.internet().url(),
                faker.harryPotter().location(),
                faker.harryPotter().quote(),
                faker.internet().image()
        );
        Pagina dos = new Pagina(
                faker.animal().name(),
                faker.internet().url(),
                faker.harryPotter().location(),
                faker.harryPotter().quote(),
                faker.internet().image()
        );
        Pagina tres = new Pagina(
                faker.animal().name(),
                faker.internet().url(),
                faker.harryPotter().location(),
                faker.harryPotter().quote(),
                faker.internet().image()
        );
        Pagina cuatro = new Pagina(
                faker.animal().name(),
                faker.internet().url(),
                faker.harryPotter().location(),
                faker.harryPotter().quote(),
                faker.internet().image()
        );


        return args -> {
            paginaRepository.saveAll(
                    List.of(uno,dos,tres,cuatro)
            );

        };
    }

}
