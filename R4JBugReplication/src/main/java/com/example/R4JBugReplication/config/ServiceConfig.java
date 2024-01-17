package com.example.R4JBugReplication.config;

import com.example.R4JBugReplication.ServiceClient;
import com.example.R4JBugReplication.ServiceClientImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ServiceClient serviceClient() {
        return new ServiceClientImpl();
    }
}
