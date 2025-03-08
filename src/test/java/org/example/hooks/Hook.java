package org.example.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    private static WebDriver driver;

    @Before
    public void setup() {
        System.out.println("Before hook");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After hook");
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
