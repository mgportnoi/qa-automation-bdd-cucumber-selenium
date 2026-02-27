package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("username");
    private By password = By.id("password");
    private By submit = By.id("submit");
    private By successMessage = By.className("post-title");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(submit).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}