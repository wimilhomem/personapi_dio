package one.digitalinnovation.personapi.config;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .ignoredParameterTypes(MessageResponseDTO.class)
                .directModelSubstitute( MessageResponseDTO.class,String.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("one.digitalinnovation.personapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo((apiInfo()));

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PersonAPI")
                .description("Digital Innovation: Bootcamp Capgemini Fullstack Java and Angular")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

}