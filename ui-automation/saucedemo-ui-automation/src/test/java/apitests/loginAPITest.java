package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginAPITest {

    @Test
    public void loginAPI(){

        String requestBody = "{\n" +
                "  \"email\": \"eve.holt@reqres.in\",\n" +
                "  \"password\": \"cityslicka\"\n" +
                "}";

        Response response = RestAssured
                .given()
                .header("Content-Type","application/json")
                .header("x-api-key","reqres_1559f0683b0f4732bb83bac140b34ac1")
                .body(requestBody)
                .post("https://reqres.in/api/login");

        int statusCode = response.getStatusCode();

        System.out.println(response.getBody().asString());

        Assert.assertEquals(statusCode,200);
    }
}