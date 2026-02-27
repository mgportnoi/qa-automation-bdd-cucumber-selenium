package steps;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);

    @Given("I am on the login page")
    public void i_am_on_login_page() {
        loginPage.navigateToLogin();
    }

    @When("I enter valid username and password")
    public void enter_valid_credentials() {
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
    }

    @When("I enter invalid username and password")
    public void enter_invalid_credentials() {
        loginPage.enterUsername("invalid");
        loginPage.enterPassword("invalid");
    }

    @And("I click on login button")
    public void click_login() {
        loginPage.clickLogin();
    }

    @Then("I should see the successful login message")
    public void validate_success() {
        Assert.assertTrue(
                loginPage.getSuccessMessage().contains("Logged In Successfully")
        );
    }

    @Then("I should see an error message")
    public void validate_error() {
        Assert.assertTrue(
                Hooks.driver.getPageSource().contains("Your username is invalid!")
        );
    }
}