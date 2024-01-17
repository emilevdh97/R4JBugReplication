package com.example.R4JBugReplication

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class WebServiceClientImplTest {

    @Autowired
    private lateinit var webServiceClient: WebServiceClient

    @Test
    fun replicateFallbackBug() {
    assertThrows<IllegalArgumentException> { webServiceClient.getResource() }
    }
}