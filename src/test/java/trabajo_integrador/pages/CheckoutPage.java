package trabajo_integrador.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import trabajo_integrador.service.DriverManager;

import java.time.Duration;

public class CheckoutPage {
    public WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completarFormularioPedido() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement sizeLButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("option-label-size-143-item-169")));


        // click en el boton de tamaño
        WebElement sizeLButton1 = driver.findElement(By.id("option-label-size-143-item-169"));
        sizeLButton1.click();
        // click en el boton de color
        WebElement colorButton = driver.findElement(By.id("option-label-color-93-item-50"));
        colorButton.click();
        // agrega la cantidad de prendas
        WebElement clickInBoxText = driver.findElement(By.id("qty"));
        clickInBoxText.click();
        clickInBoxText.clear();
        WebElement sizeDropdown = driver.findElement(By.id("qty"));
        sizeDropdown.sendKeys("2");
    //click en el boton de acregar al carrito
        WebElement clickAddToCart = driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']"));
        clickAddToCart.click();
    }


    public void hacerClickEnElCarrito() {
//click en el boton del carrito
        WebElement clickInCart = driver.findElement(By.xpath("//a[@class='action showcart']"));
        clickInCart.click();
//espera a que aparezca el cartel desplegable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement proceedCheckout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='action showcart']")));
        proceedCheckout.click();

        WebElement proceedCheckout2 = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
        proceedCheckout2.click();


    }
}

