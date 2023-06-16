package com.example.webapp.resource;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleResourceITCase {

    @Test
    void testSomething() {
        try (final Client client = ClientBuilder.newClient()) {
            final WebTarget target = client.target("http://localhost:8080/example/api");
            final Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Resource-Constructor-Header", "a")
                    .header("Resource-Field-Header", "b")
                    .header("Resource-Property-Header", "c")
                    .header("BeanParam-Constructor-Header", "d")
                    .header("BeanParam-Field-Header", "e")
                    .header("BeanParam-Property-Header", "f")
                    .get();
            final HeaderResult result = response.readEntity(HeaderResult.class);
            assertEquals("a", result.getResourceConstructorHeader());
            assertEquals("b", result.getResourceFieldHeader());
            assertEquals("c", result.getResourcePropertyHeader());
            assertEquals("d", result.getBeanParamConstructorHeader());
            assertEquals("e", result.getBeanParamFieldHeader());
            assertEquals("f", result.getBeanParamPropertyHeader());
        }
    }

}