package org.example.hooks;

import org.example.pages.AddToCartPage;
import org.example.pages.HomePage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserFactory {
    private WebDriver driver = Hook.getDriver();

    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
    protected AddToCartPage addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
}

