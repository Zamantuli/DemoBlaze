package org.example.steps;

import io.cucumber.java.en.*;
import org.example.hooks.BrowserFactory;

import static org.testng.Assert.assertTrue;

public class CartStepsDef extends BrowserFactory {
    @And("I click the Cart button")
    public void i_click_the_cart_button() {
        addToCartPage.goToCart();
    }

    @And("I click the Place order button")
    public void i_click_the_place_order_button() {
        addToCartPage.placeOrder();
    }

    @And("I fill in the form with random data")
    public void i_fill_in_the_form_with_random_data() {
        addToCartPage.enterRandomData();
    }

    @And("I click the Purchase button")
    public void i_click_the_purchase_button() {
        addToCartPage.clickPurchaseButton();
    }

    @Then("I should see the Purchase successful message")
    public void i_should_see_the_purchase_successful_message() {
        assertTrue(addToCartPage.isPurchaseMessageDisplayed());
    }

    @And("I confirm the purchase by clicking the ok button")
    public void i_confirm_the_purchase_by_clicking_the_ok_button() {
        addToCartPage.clickConfirmButton();
    }
}
