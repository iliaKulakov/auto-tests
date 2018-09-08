package io.github.maventest.tests;

import io.github.maventest.pageObjects.Draggable;
import io.github.maventest.pageObjects.GooglePage;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import ru.stqa.selenium.factory.WebDriverPool;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;


public class DraggablePageTest {

    private WebDriver driver;

   // @AfterAll
   // public static void stopAllBrowsers() {
   //     WebDriverPool.DEFAULT.dismissAll();
   // }

    @BeforeEach
    public void startBrowser() {
        InputStream fis;
        Properties properties = new Properties();
        try {
            fis = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.path"));
        driver = WebDriverPool.DEFAULT.getDriver(new ChromeOptions());
    }



    @Test
    public void test() throws InterruptedException {
        doSomething();

    }

    private void doSomething() throws InterruptedException{
        Draggable draggable = new Draggable(driver);
        Actions actions = new Actions(driver);
        actions.click(draggable.getDefaultFunctionalityButton());
        Thread.sleep(5000);
        actions.moveToElement(draggable.getDraggableButton())
                .clickAndHold()
                .moveByOffset(-1, -1)
                .moveByOffset(810,29)
                .release()
                .perform();
        Thread.sleep(5000);

    }


    }


