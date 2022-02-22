   
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"model", "repository", "service"})
public class ProjectConfig {

//    @Bean
//    Parrot parrot() {
//        var pajarito = new Parrot();
//        pajarito.setName("Louro Jose");
//        return pajarito;
//    }
//
//    @Bean(name = "Laura")
//    @Primary
//    Parrot parrotina() {
//        var pajarita = new Parrot();
//        pajarita.setName("Laura Jose");
//        return pajarita;
//    }
}