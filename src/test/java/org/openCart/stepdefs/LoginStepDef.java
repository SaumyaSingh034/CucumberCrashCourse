package org.openCart.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openCart.Hooks.AppHooks;
import org.openCart.driverFactory.DriverFactory;
import org.openCart.pages.LoginPage;
import org.testng.Assert;

public class LoginStepDef extends DriverFactory {

    private LoginPage loginPage = new LoginPage(driver);



    @Given("User is on the OpenCart login Page")
    public void user_is_on_the_open_cart_login_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

    }

    @When("user clicks on login Button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginBtn();

    }

    @Then("user should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Account Login");

    }

    @Given("user have entered valid username {string} and password {string}")
    public void userHaveEnteredValidUsernameAndPassword(String userName, String pass) {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(pass);
    }

    @Given("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String userName, String pass) {
        loginPage.doInvalidLogin(userName, pass);


    }

    @Then("user should see error message indicating {string}")
    public void userShouldSeeErrorMessageIndicating(String errorMessage) {
        Assert.assertEquals(loginPage.checkErrorMessage(), true);
    }
}
