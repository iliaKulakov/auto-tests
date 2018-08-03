package io.github.maventest.tests;

import io.github.maventest.pageObjects.GooglePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.stqa.selenium.factory.WebDriverPool;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GoogleSearchTest {

    private WebDriver driver;

    @AfterAll
    public static void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

   // @BeforeEach
   // public void startBrowser() {
   //     driver = WebDriverPool.DEFAULT.getDriver(new ChromeOptions());
   // }

    @BeforeEach
    public void setUp() {
        InputStream fis;
        Properties properties = new Properties();
        try {
            fis = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.path"));
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        doSomething();
    }

    private void doSomething() {
        driver.get("https://www.google.com");

        GooglePage googlePage = new GooglePage(driver);

        assertNotNull(googlePage.getLogo(), "Can't find logo element");
    }
}




