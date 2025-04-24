package io.github.GuilhermeC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Executando... RODANDO A CONFIGURAÇÃO DO AMBIENTE DE DESENVOLVIMENTO");
        };
    }


}
