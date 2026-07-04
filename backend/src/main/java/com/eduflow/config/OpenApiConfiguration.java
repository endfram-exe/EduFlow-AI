package com.eduflow.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    OpenAPI eduFlowOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("EduFlow AI API")
                        .version("0.1.0")
                        .description("API foundation for the EduFlow AI school ERP platform."));
    }
}
