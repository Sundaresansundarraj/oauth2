package com.example.apis.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class LoggingFilter implements GatewayFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

