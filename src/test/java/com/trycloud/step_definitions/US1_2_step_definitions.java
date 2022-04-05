package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_2_step_definitions {
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String pw) {
        loginPage.login(username, pw);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String expectedURL = "dashboard";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("User is not at the dashboard page" , actualURL.contains(expectedURL));
    }


    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String pw) {
        loginPage.login(username, pw);
    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String expectedResult) {
        String actualResult = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
