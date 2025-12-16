package ru.netology.rest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaTest {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "http://localhost:9999";
    }

    @Test
    void shouldReturnValidSchema() {
        get("/api/v1/demo/accounts")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"));
    }
}
