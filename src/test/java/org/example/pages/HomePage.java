package org.example.pages;

import org.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver d) {
        super(d);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginButton;

    @FindBy (id = "loginusername")
    private WebElement loginUsername;

    @FindBy (id = "loginpassword")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton2;

    public void clickLoginButton() {
        getWebElement(loginButton).click();
    }

    public void enterUsername(String username) {
        getWebElement(loginUsername).sendKeys(username);
    }

    public void enterPassword(String password){
        getWebElement(loginPassword).sendKeys(password);
    }

    public void clickLoginButton2() {
        getWebElement(loginButton2).click();
    }
}
