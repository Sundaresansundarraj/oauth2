package com.example.apis.config;



import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("aak", r -> r.path("/users/**")
                        .uri("http://localhost:8081"))
                .route("tho", r -> r.path("/products/**")
                        .uri("http://localhost:8082"))
                .build();
    }
}

