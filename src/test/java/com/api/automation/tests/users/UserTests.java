package com.api.automation.tests.users;

import com.api.automation.client.ApiClient;
import com.api.automation.models.User;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserTests {
    private static final String USERS_ENDPOINT = "/users";

    @Test
    public void testGetUsers() {
        Response response = ApiClient.getRequest(USERS_ENDPOINT);
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Response: " + response.getBody().asString());
    }

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setId(1);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        Response response = ApiClient.postRequest(USERS_ENDPOINT, user);
        Assert.assertEquals(response.getStatusCode(), 201);
        System.out.println("Response: " + response.getBody().asString());
    }
}
