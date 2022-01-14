package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "model")
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var pajarito = new Parrot();
        pajarito.setName("Louro Jose");
        return pajarito;
    }

    @Bean(name = "Laura")
    @Primary
    Parrot parrotina() {
        var pajarita = new Parrot();
        pajarita.setName("Laura Jose");
        return pajarita;
    }
}
