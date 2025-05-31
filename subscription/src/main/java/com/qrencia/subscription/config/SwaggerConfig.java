package com.qrencia.subscription.config;

import org.springframework.context.annotation.*;
import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("Subscription API")
                            .version("1.0")
                            .description("API documentation for managing tiers, categories, and features in the subscription system."));
    }
}
