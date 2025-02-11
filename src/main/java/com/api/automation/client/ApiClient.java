package com.api.automation.client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ApiClient {

    static {
        RestAssured.baseURI = "http://localhost:3000";
    }

    public static Response getRequest(String endpoint) {
        return given()
                .when()
                .get(endpoint);
    }

    public static Response postRequest(String endpoint, Object body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint);
    }
}
