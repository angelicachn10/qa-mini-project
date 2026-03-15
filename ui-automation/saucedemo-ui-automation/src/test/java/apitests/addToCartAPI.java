package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addToCartAPI {

    @Test
    public void addToCartAPI() {

        String body = "{\n" +
                "  \"name\": \"product_sneakers\",\n" +
                "  \"job\": \"add_to_cart\"\n" +
                "}";

        Response response = RestAssured
                .given()
                .header("Content-Type","application/json")
                .header("x-api-key","reqres_1559f0683b0f4732bb83bac140b34ac1") // pakai key yang kamu buat
                .body(body)
                .post("https://reqres.in/api/users");

        System.out.println(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(),201);
        Assert.assertEquals(response.jsonPath().getString("job"),"add_to_cart");
    }
}