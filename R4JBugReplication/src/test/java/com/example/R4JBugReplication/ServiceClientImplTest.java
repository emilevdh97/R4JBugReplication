package com.example.R4JBugReplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ServiceClientImplTest {

    @Autowired
    private ServiceClient serviceClient;

    @Test
    public void R4JBugReplication() {
        assertThrows(IllegalArgumentException.class, () -> serviceClient.getResource());
    }
}
