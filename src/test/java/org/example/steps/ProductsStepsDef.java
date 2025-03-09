package org.example.steps;

import io.cucumber.java.en.*;
import org.example.hooks.BrowserFactory;

import static org.testng.Assert.assertEquals;

public class ProductsStepsDef extends BrowserFactory {
    @Given("I click on the {string} product")
    public void i_click_on_the_product(String product) {
        productsPage.clickProduct(product);
    }

    @And("I click on the Add to cart button")
    public void i_click_on_the_Add_to_cart_button() {
        addToCartPage.clickAddToCartButton();
    }

    @Then("I should see the Product added message")
    public void i_should_see_the_Product_added_message() {
        assertEquals(addToCartPage.getAlertText(), "Product added.");
    }
//
//    @Given("^I click on the (.+) product$")
//    public void i_click_to_add_product(String product) {
//        productsPage.clickProduct(product);
//    }

    @And("I click the ok button")
    public void i_click_the_ok_button() {
        addToCartPage.acceptAlert();
    }

    @And("I click the home button")
    public void i_click_the_home_button() {
        addToCartPage.goHome();
    }
}