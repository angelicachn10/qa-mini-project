package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    WebDriver driver;

    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCart(){
        driver.findElement(addToCartButton).click();
    }

}