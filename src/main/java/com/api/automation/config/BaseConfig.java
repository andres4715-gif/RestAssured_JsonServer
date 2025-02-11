package com.api.automation.config;

import io.restassured.RestAssured;

public class BaseConfig {
    static {
        RestAssured.baseURI = "http://localhost:3000";
    }
}

