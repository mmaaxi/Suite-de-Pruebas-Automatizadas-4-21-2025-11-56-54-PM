package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_02Page;

public class tc_02Steps {
    WebDriver driver = new ChromeDriver();
    tc_02Page loginPage = new tc_02Page(driver);

    @Given("^el usuario está en la página de login$")
    public void userIsOnLoginPage() {
        driver.get("https://example.com/login");
    }

    @When("^el usuario ingresa credenciales inválidas$")
    public void userEntersInvalidCredentials() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();
    }

    @Then("^el sistema muestra un mensaje de error$")
    public void systemShowsErrorMessage() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        driver.quit();
    }
}