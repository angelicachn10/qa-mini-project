package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AddToCartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickAddToCart();

        String cartNumber = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartNumber,"1");
    }
}