package trabajo_integrador.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    private WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void irAlCarrito() {
        WebElement shoppingCartLink = driver.findElement(By.xpath("//a[contains(@class,'skip-link skip-cart')]"));
        shoppingCartLink.click();
    }

    public void procederAlCheckout() {
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//button[@title='Proceed to Checkout']"));
        proceedToCheckoutButton.click();
    }
}
