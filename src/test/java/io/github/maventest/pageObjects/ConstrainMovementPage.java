package io.github.maventest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConstrainMovementPage {

    public WebElement getConstrainMovementButton() {
        return constrainMovementButton;
    }

    public WebElement getDragVerticallyButton() {
        return dragVerticallyButton;
    }

    WebElement constrainMovementButton;
    WebElement dragVerticallyButton;
    WebDriver driver;

    public ConstrainMovementPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://demoqa.com/draggable/");
        constrainMovementButton = driver.findElement(By.id ( "ui-id-2"));
        dragVerticallyButton = driver.findElement(By.id ( "draggabl"));


    }
}
