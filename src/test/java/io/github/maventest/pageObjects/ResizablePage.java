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

public class ResizablePage {

    WebElement defaultFunctionalityResizableButton;
    WebElement resizableButton;
    WebDriver  driver;

    public ResizablePage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://demoqa.com/resizable/");
        defaultFunctionalityResizableButton = driver.findElement(By.id ( "ui-id-1"));
        resizableButton = driver.findElement(By.className("ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se"));
    }

    public WebElement getDefaultFunctionalityButton() {
        return defaultFunctionalityResizableButton;
    }

    public WebElement getDraggableButton() {
        return resizableButton;
    }





}
