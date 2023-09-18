package com.funtec.meuprimeiroapi.doc;

import org.springframework.context.annotation.Configuration; 
import java.util.Arrays; 
import java.util.HashSet; 
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors; 
import springfox.documentation.builders.RequestHandlerSelectors; 
import springfox.documentation.spi.DocumentationType; 
import springfox.documentation.spring.web.plugins.Docket; 
import springfox.documentation.swagger2.annotations.EnableSwagger2; 
import springfox.documentation.service.Contact; 



@Configuration //é uma classe de configuração
@EnableSwagger2 //habilitando a doc do swaggerpackage com.funtec.meuprimeiroapi.doc;
public class SwaggerConfig {
	
	private Contact contato() { 
		 return new Contact( 
		 "Seu nome", 
		"http//seusite.com.br", 
		"shirleifuntec@gmail.com"); 
		 
		 } 
		 
		//Informações da API
		private ApiInfoBuilder informacoesApi() { 
		 
		 ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder(); 
		 
		 apiInfoBuilder.title("Title - Rest Api"); 
		 apiInfoBuilder.description("Api exemplo de uso de SpringBootRest Api"); 
		 apiInfoBuilder.version("1.0"); 
		 apiInfoBuilder.termsOfServiceUrl("Termo de usso: Open Source"); 
		 apiInfoBuilder.license("Licença - sua empresa"); 
		 apiInfoBuilder.licenseUrl("http://www.seusite.com.br"); 
		 apiInfoBuilder.contact(this.contato()); 
		 
		 return apiInfoBuilder; 
		 
		 } 
		 
		//como se trata de uma aplicação SpringBoot, vamos criar um Docket(documento) em forma de @bean
		@Bean
		public Docket detalheApi() { 
		 Docket docket = new Docket(DocumentationType.SWAGGER_2); 
		 
		 
		 docket.select().apis(RequestHandlerSelectors.basePackage("Funtec.meuprimeirowebapi.controller"))
		 .paths(PathSelectors.any()) 
		 .build() 
		 .apiInfo(this.informacoesApi().build()) 
		 .consumes(new
		HashSet<String>(Arrays.asList("application/json"))) 
		 .produces(new
		HashSet<String>(Arrays.asList("application/json"))); 
		 
		 return docket; 
		 } 
}