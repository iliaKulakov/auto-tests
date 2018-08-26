package io.github.maventest.tests;

import io.github.maventest.pageObjects.Draggable;
import io.github.maventest.pageObjects.GooglePage;
import io.github.maventest.pageObjects.ResizablePage;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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


public class ResizablePageTest {

    private WebDriver driver;

    @AfterAll
    public static void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

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
    public void test()throws InterruptedException {
        doSomething();
    }

    private void doSomething()throws InterruptedException {
        ResizablePage resizablePage = new ResizablePage(driver);
        Actions actions = new Actions(driver);
        //actions.click(resizablePage.getDefaultFunctionalityButton());
        //Thread.sleep(5000);
        actions.dragAndDropBy(resizablePage.getresizableButton(),250, 250)
                .build()
                .perform();
        Thread.sleep(5000);
    }


}
