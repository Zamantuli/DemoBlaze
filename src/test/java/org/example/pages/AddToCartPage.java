package org.example.pages;

import org.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "btn-success")
    protected WebElement addToCartButton;

    public void clickAddToCartButton() {
        getWebElement(addToCartButton).click();
    }
}
