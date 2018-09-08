package io.github.maventest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

    private WebDriver driver;

    private By logo = By.id("hplogo");

    public GooglePage(WebDriver driver) {
        this.driver = driver;

        if (!"Google".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the google page");
        }
    }

    public WebElement getLogo() {
        return driver.findElement(logo);
    }

}
