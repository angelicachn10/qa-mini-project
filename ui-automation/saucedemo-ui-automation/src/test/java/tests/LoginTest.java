package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test
    public void loginStandardUser(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

}