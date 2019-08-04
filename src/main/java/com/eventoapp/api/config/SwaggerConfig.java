package com.eventoapp.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eventoapp.api"))
                .paths(PathSelectors.regex("/eventoapp/.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "EventoApp API REST",
                "API Rest de cadastro de eventos.",
                "1.0",
                "Terms os Seervice",
                new Contact("Wesley Belizario", "http://wesleyxbz.github.io", "wesleyxbzs@gmail.com"),
                "Apache License Version 2.0",
                "  ", new ArrayList<>()
        );
        return apiInfo;
    }
}