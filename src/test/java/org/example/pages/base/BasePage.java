package org.example.pages.base;

import org.example.utils.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    private WebDriver driver;
    protected WebDriverWait wait;
    protected static List <Products> productsList;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public WebElement getWebElement(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> getWebElements(WebElement elements) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public String getAlertText(){
        return wait.until(ExpectedConditions.alertIsPresent()).getText();
    }

    public void acceptAlert(){
        String mainWindowHandle = driver.getWindowHandle();

        // Wait for the alert and accept it
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        // After accepting the alert, switch back to the main window
        driver.switchTo().window(mainWindowHandle);
    }

    public static List<Products> getProductsList() {
        return productsList;
    }

    public void goHome() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("nav-link")))).click();
    }
}
