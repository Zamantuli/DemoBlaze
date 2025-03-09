package org.example.pages;

import com.github.javafaker.Faker;
import org.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {
    private Faker faker;

    public AddToCartPage(WebDriver driver) {
        super(driver);
        faker = new Faker();
    }

    @FindBy(className = "btn-success")
    protected WebElement addToCartButton;

    @FindBy(id = "name")
    protected WebElement nameField;

    @FindBy(id = "country")
    protected WebElement countryField;

    @FindBy(id = "city")
    protected WebElement cityField;

    @FindBy(id = "card")
    protected WebElement cardField;

    @FindBy(id = "month")
    protected WebElement monthField;

    @FindBy(id = "year")
    protected WebElement yearField;

    @FindBy(xpath = "//button[text()='Purchase']")
    protected WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='Close']")
    protected WebElement closeButton;

    @FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
    protected WebElement purchaseMessage;

    @FindBy(className = "confirm")
    protected WebElement confirmButton;

    public void clickAddToCartButton() {
        getWebElement(addToCartButton).click();
    }

    public void placeOrder() {
        getWebElement(addToCartButton).click();
    }

    public void enterRandomData() {
        getWebElement(nameField).sendKeys(faker.name().fullName());
        getWebElement(countryField).sendKeys(faker.country().name());
        getWebElement(cityField).sendKeys(faker.address().city());
        getWebElement(cardField).sendKeys(faker.finance().creditCard());
        getWebElement(monthField).sendKeys(String.valueOf(faker.number().numberBetween(1, 12)));
        getWebElement(yearField).sendKeys(String.valueOf(faker.number().numberBetween(2025, 2030)));
    }

    public void clickPurchaseButton() {
        getWebElement(purchaseButton).click();
    }

    public boolean isPurchaseMessageDisplayed() {
        return getWebElement(purchaseMessage).isDisplayed();
    }

    public void clickConfirmButton() {
        getWebElement(confirmButton).click();
    }
}
