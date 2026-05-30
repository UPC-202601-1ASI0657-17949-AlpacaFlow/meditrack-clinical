package com.alpacaflow.meditrack.clinical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class ClinicalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicalApplication.class, args);
    }

}
