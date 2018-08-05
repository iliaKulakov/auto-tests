package io.github.maventest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoqaRegistrationPage {

     WebDriver  driver;
     WebElement firstname;
     WebElement lastname;
     WebElement maritalstatus; //radiobutton
     WebElement hobby; //checkbox
     WebElement country;
     WebElement dateofbirthday;
     WebElement dateofbirthmonth;
     WebElement dateofbirthyear;
     WebElement phonenumber;
     WebElement username;
     WebElement email;
     WebElement yourprofilepicture;
     WebElement aboutyourself;
     WebElement password;
     WebElement confirmPassword;
     Select select;
     WebElement submit;

    public DemoqaRegistrationPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://demoqa.com/registration/");
        firstname = driver.findElement(By.id ( "name_3_firstname"));
        lastname = driver.findElement(By.id ( "name_3_lastname"));
        maritalstatus = driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")); //predefined single status
        hobby = driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[1]"));//checkbox predefined Dance
        country = driver.findElement(By.id("dropdown_7"));
        dateofbirthday = driver.findElement(By.id("mm_date_8"));
        dateofbirthmonth = driver.findElement(By.id("dd_date_8"));
        dateofbirthyear = driver.findElement(By.id("yy_date_8"));
        phonenumber = driver.findElement(By.id("phone_9"));
        username = driver.findElement(By.id("username"));
        email = driver.findElement(By.id("email_1"));
        //yourprofilepicture = driver.findElement(By.id("));
        aboutyourself = driver.findElement(By.id("description"));
        password = driver.findElement(By.id("password_2"));
        confirmPassword = driver.findElement(By.id("confirm_password_password_2"));
        submit = driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input"));
    }

    public void login(){
        firstname.sendKeys("FirstNameTEST");
        lastname.sendKeys("LastNameTEST");
        maritalstatus.click();
        hobby.click();
        Select select = new Select(country);
        select.selectByValue("Guinea");
        select = new Select(dateofbirthday);
        select.selectByValue("6");
        select = new Select(dateofbirthmonth);
        select.selectByValue("10");
        select = new Select(dateofbirthyear);
        select.selectByValue("1987");
        phonenumber.sendKeys("8999111222");
        username.sendKeys("Testlogin_LOGIN");
        email.sendKeys("test11111111111@test.com");
        //yourprofilepicture
        aboutyourself.sendKeys("TEST INFORMATION ABOUT YOURSELF");
        password.sendKeys("12345678z");
        confirmPassword.sendKeys("12345678z");
        submit.click();

    }

}
