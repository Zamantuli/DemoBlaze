package org.example.pages;

import org.example.pages.base.BasePage;
import org.example.utils.Products;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver d) {
        super(d);
    }

    @FindBy(id = "nameofuser")
    protected WebElement user;

    @FindAll (@FindBy(className = "h-100"))
    protected List<WebElement> productsTable;

    @FindBy(id = "cat")
    protected WebElement category;

    public String getUserName() {
        addProductsToList();
        return getWebElement(user).getText();
    }

    public List<WebElement> getProducts() {
        return getWebElements(productsTable);
    }

    public void clickProduct(String product) {
        if (isCategoryDisplayed()) {
            Optional<WebElement> item = getProducts().stream()
                    .filter(p -> p.getText().contains(product))
                    .findFirst();
            if (item.isPresent()) {
                scrollToItem(item.get());
                item.get().click();
            }
        }
    }

    public void addProductsToList() {
        productsList = getProducts().stream()
                .map(p -> {
                    String[] productDetails = p.getText().split("\n");
                    return new Products(productDetails[0], productDetails[1], productDetails[2]);
                })
                .toList();
    }

    public boolean isCategoryDisplayed() {
        return getWebElement(category).isDisplayed();
    }
}
