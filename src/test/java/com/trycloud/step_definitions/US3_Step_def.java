package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;


public class US3_Step_def {
    DashboardPage dashboardPage = new DashboardPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().loginWithCredential(ConfigurationReader.getProperty("username1"), "Userpass123");
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesText) {
        Assert.assertEquals(expectedModulesText, dashboardPage.getTextOfModules());

    }



}
