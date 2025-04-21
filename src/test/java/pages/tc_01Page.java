package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_01Page {

    WebDriver driver;
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By mainPageIndicator = By.id("mainPage");

    public tc_01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isMainPageDisplayed() {
        return driver.findElement(mainPageIndicator).isDisplayed();
    }
}