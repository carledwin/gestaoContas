package com.carledwinj.gestaocontas.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Configuration {

	@Bean
	public Docket contasApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.carledwinj.gestaocontas.restcontroller"))
				.paths(regex("/contas.*"))
				.build()
				.apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		
		return new ApiInfo("Gestão de Contas API",
			      "Esta api tem por objetivo controlar contas a vencer, vencidas, pagas e canceladas.",
			      "1.0.0",
			      "Terms of API",
			      new Contact("Carl Edwin Antonio Nascimento", "https://carledwinj.wordpress.com/", "carlinstr@gmail.com"),
			      "Apache License Version 2.0",
			      "https://www.apache.org/licesen.html",
			      new ArrayList<VendorExtension>());
	}
}
