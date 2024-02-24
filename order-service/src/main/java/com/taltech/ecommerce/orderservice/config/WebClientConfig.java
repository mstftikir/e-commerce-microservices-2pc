package com.taltech.ecommerce.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @Profile("docker")
    @LoadBalanced
    public WebClient.Builder webClientBuilderLoadBalanced() {
        return WebClient.builder();
    }

    @Bean
    @Profile("!docker")
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
