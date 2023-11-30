package trabajo_integrador.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutFormularioPage {
    private WebDriver driver;

    public CheckoutFormularioPage(WebDriver driver) {
        this.driver = driver;
    }

  public void completarFormularioDeEnvio() {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

      // Ingresa el correo electrónico
      WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']")));
      email.sendKeys("david@hh.com");

      // Ingresa el nombre
      WebElement nombre = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("KCHQYEX")));
      nombre.click();
      nombre.sendKeys("David");

      // Ingresa el apellido
      WebElement apellido = driver.findElement(By.id("R8PD07U"));
      apellido.sendKeys("mover");

      // Ingresa la dirección
      WebElement direccion = driver.findElement(By.id("I8RSG5N"));
      direccion.sendKeys("german abdala 1234");

      // Ingresa la ciudad
      WebElement ciudad = driver.findElement(By.id("I690IO6"));
      ciudad.sendKeys("concordia");

      // Selecciona la provincia
      Select provincia = new Select(driver.findElement(By.id("K1ED7UE")));
      provincia.selectByVisibleText("Alabama");  // Ajusta el ID según la estructura de tu página

      // Ingresa el código postal
      WebElement codigoPostal = driver.findElement(By.id("B2ODH5P"));
      codigoPostal.sendKeys("3200");
  }
}