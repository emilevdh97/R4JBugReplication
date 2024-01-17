package com.example.R4JBugReplication;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public class ServiceClientImpl implements ServiceClient {
    @CircuitBreaker(name = "getResource", fallbackMethod = "fallback")
    @Override
    public String getResource() {
        throw new RuntimeException("this is an exception");
    }

    @Override
    public String fallback(Exception e) {
        return "getResource fallback response";
    }
}
