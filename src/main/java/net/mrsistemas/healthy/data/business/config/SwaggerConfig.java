package net.mrsistemas.healthy.data.business.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.mrsistemas.healthy.data.facade.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Healthy API",
                "Api para el control y regiustro de datos médicos, fisicos y personales de los usuarios.",
                "0.0.1",
                "Terms of service",
                new Contact("Max Fredis Tovar Hernández", "www.myrsistemas.net", "maxther911@gmail.com"),
                "License",
                "/license",
                Collections.emptyList());
    }
}

