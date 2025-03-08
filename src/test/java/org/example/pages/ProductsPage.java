package org.example.pages;

import org.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver d) {
        super(d);
    }

    @FindBy(id = "nameofuser")
    protected WebElement user;

    public String getUserName() {
        return getWebElement(user).getText();
    }
}
