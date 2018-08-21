package io.github.maventest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Draggable {

    WebElement defaultFunctionalityButton;
    WebElement draggableButton;
    WebDriver  driver;

    public Draggable(WebDriver driver) {
                this.driver = driver;
                driver.get("http://demoqa.com/draggable/");
                defaultFunctionalityButton = driver.findElement(By.id ( "ui-id-1"));
                draggableButton = driver.findElement(By.id("draggable"));
            }

    public WebElement getDefaultFunctionalityButton() {
        return defaultFunctionalityButton;
    }

    }

