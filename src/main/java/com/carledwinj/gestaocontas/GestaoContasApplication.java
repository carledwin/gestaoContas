package com.carledwinj.gestaocontas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages= {"com.carledwinj.gestaocontas"})
public class GestaoContasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoContasApplication.class, args);
	}
}
