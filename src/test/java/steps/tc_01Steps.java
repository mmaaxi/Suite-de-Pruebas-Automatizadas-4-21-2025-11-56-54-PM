package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_01Page;
import static org.junit.Assert.assertTrue;

public class tc_01Steps {

    WebDriver driver;
    tc_01Page loginPage;

    @Given("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
        loginPage = new tc_01Page(driver);
    }

    @When("ingresa credenciales válidas")
    public void ingresaCredencialesValidas() {
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginButton();
    }

    @Then("el usuario es autenticado y es redirigido a la página principal")
    public void elUsuarioEsAutenticadoYEsRedirigidoALaPaginaPrincipal() {
        assertTrue(loginPage.isMainPageDisplayed());
        driver.quit();
    }
}