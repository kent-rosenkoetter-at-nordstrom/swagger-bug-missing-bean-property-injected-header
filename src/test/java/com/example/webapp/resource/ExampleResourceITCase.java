package com.example.webapp.resource;

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleResourceITCase {

    public static final String BASE_URL = "http://localhost:8080/swagger-bug";

    @Test
    void testHeaders() {
        try (final Client client = ClientBuilder.newClient()) {
            final WebTarget target = client.target(BASE_URL).path("example").path("api");
            final Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Resource-Constructor-Header", "one")
                    .header("Resource-Field-Header", "two")
                    .header("Resource-Property-Header", "three")
                    .header("Resource-Additional-Header", "four")
                    .header("BeanParam-Constructor-Header", "five")
                    .header("BeanParam-Field-Header", "six")
                    .header("BeanParam-Property-Header", "seven")
                    .header("BeanParam-Additional-Header", "eight")
                    .get();
            final HeaderResult result = response.readEntity(HeaderResult.class);
            assertEquals("one", result.getResourceConstructorHeader());
            assertEquals("two", result.getResourceFieldHeader());
            assertEquals("three", result.getResourcePropertyHeader());
            assertEquals("four", result.getResourceAdditionalHeader());
            assertEquals("five", result.getBeanParamConstructorHeader());
            assertEquals("six", result.getBeanParamFieldHeader());
            assertEquals("seven", result.getBeanParamPropertyHeader());
            assertEquals("eight", result.getBeanParamAdditionalHeader());
        }
    }

    @Test
    void testOpenAPI() {
        try (final Client client = ClientBuilder.newClient()) {
            final WebTarget target = client.target(BASE_URL).path("example").path("openapi");
            final Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
                    .get();
            final JsonObject result = response.readEntity(JsonObject.class);
            final JsonObject paths = result.getJsonObject("paths");
            final JsonObject examplePath = paths.getJsonObject("/example/api");
            final JsonObject getMethod = examplePath.getJsonObject("get");
            final JsonArray parameters = getMethod.getJsonArray("parameters");
            assertEquals(8, parameters.size());
        }
    }

}