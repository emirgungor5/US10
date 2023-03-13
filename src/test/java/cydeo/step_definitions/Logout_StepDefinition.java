package cydeo.step_definitions;

import cydeo.pages.LogOutPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinition {

    LogOutPage logOutPage = new LogOutPage();
    @When("User enters username {string}")
    public void user_enters_username(String string) {
        logOutPage.inputUsername.sendKeys(string);
    }

    @When("user enters password  {string}")
    public void user_enters_password(String string) {
        logOutPage.inputpassword.sendKeys(string);
    }

    @When("user click Login Button")
    public void user_click_login_button() {
        logOutPage.LogInButton.click();
    }

    @When("User click A Button")
    public void user_click_a_button() {
        logOutPage.UsernameButton.click();
    }

    @When("User click logout Button")
    public void user_click_logout_button() {
        logOutPage.LogOutButton.click();
    }

    @Then("User see login Page")
    public void user_see_login_page() {
        String expectedURL = "https://qa.seamlessly.net/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
    }
}