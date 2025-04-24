package io.github.GuilhermeC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean (name = "Cachorro")
    public Animal Cachorro() {
        return new Animal() {
            @Override
            public void fazerBarulho () {
                System.out.println("Au Au Au Au Au");
            }
        };
    }

    @Bean (name = "Gato")
    public Animal Gato() {
        return new Animal() {
            @Override
            public void fazerBarulho () {
                System.out.println("Miauuuuuuuu Miauuuuuuu");
            }
        };
    }
}


