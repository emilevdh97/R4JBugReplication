package com.example.R4JBugReplication

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebServiceClientImplTest {

    @Autowired
    private lateinit var webServiceClient: WebServiceClient

    @Test
    fun replicateFallbackBug() {
        println(webServiceClient::class.java)
        assert(!webServiceClient::class.java.toString().contains("SpringCGLIB"))
        webServiceClient.getResource()
    }
}