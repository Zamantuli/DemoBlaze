package org.example.steps;

import io.cucumber.java.en.*;
import org.example.hooks.BrowserFactory;

import static org.testng.Assert.assertEquals;

public class LoginStepsDef extends BrowserFactory {

    @Given("I open the browser and navigate to the login page")
    public void i_open_the_browser_and_navigate_to_the_login_page() {
        assertEquals(homePage.getPageTitle(), "STORE", "Page title is not as expected");
        homePage.clickLoginButton();
    }

    @When("I enter the {string} and {string}")
    public void i_enter_the_and(String username, String password) {
        homePage.enterUsername(username);
        homePage.enterPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button(){
        homePage.clickLoginButton2();
    }

    @Then("I should see the {string} text")
    public void i_should_see_the_welcome_admin_text(String text) {
        assertEquals(productsPage.getUserName(), text);
    }
}
