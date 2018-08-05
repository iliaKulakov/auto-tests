package io.github.maventest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DemoqaRegistrationPage {

     WebDriver driver;
     WebElement firstname;

    public DemoqaRegistrationPage(WebDriver driver) {
        this.driver=driver;
        driver.get("http://demoqa.com/registration/");
        firstname=driver.findElement(By.id ( "name_3_firstname"));
    }

   public void login(){
    firstname.sendKeys("TESTtest");
   }


}
