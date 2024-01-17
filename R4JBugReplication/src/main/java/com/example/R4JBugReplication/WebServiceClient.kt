package com.example.R4JBugReplication

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker

interface WebServiceClient {
    fun getResource(): String
    fun fallback(throwable: Throwable): String
}

open class WebServiceClientImpl: WebServiceClient {

    @CircuitBreaker(name = "getResource", fallbackMethod = "fallback")
    override fun getResource(): String {
        throw RuntimeException("Simulated Error")
    }
    override fun fallback(throwable: Throwable): String = "No response returned"

}