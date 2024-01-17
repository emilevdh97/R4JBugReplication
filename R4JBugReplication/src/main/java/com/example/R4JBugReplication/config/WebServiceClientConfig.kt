package com.example.R4JBugReplication.config

import com.example.R4JBugReplication.WebServiceClient
import com.example.R4JBugReplication.WebServiceClientImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

@Configuration
open class WebServiceClientConfig {

    @Bean
    open fun webServiceClient(): WebServiceClient = WebServiceClientImpl()

}