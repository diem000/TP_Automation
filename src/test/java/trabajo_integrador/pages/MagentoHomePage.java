package trabajo_integrador.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MagentoHomePage {
    private WebDriver driver;

    public MagentoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirNavegador() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    public void seleccionarPrenda() {
        WebElement radiantTee = driver.findElement(By.xpath("//a[contains(text(),'Radiant Tee')]"));
        radiantTee.click();
    }
}
