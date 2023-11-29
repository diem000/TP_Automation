package trabajo_integrador.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MagentoCompraTest {
    public static void main(String[] args) throws Exception {
        // Configuración del sistema para el driver de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIEM\\IdeaProjects\\TPintegrador\\src\\test\\resources\\drivers\\chromedriver.exe");

        // Inicialización del WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Crear instancias de las clases de página
        MagentoHomePage homePage = new MagentoHomePage(driver);
       // ShoppingCartPage cartPage = new ShoppingCartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutFormularioPage checkoutFormularioPage = new CheckoutFormularioPage(driver);


        //  Abrir el navegador e ir al sitio web de Magento
        homePage.abrirNavegador();

        // Seleccionar la prenda "Radiant Tee"
        homePage.seleccionarPrenda();


        //  Completar el formulario de pedido
       checkoutPage.completarFormularioPedido();

       //hace click en el carrito
       checkoutPage.hacerClickEnElCarrito();

       // completar el formulario de envio
        checkoutFormularioPage.completarFormularioDeEnvio();


        // Paso 5: Seleccionar el método de envío y hacer clic en "Place Order"





        // Realizar validaciones
        // ...

        // Cerrar el navegador al finalizar
        driver.quit();
    }
}