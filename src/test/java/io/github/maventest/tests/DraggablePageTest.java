package io.github.maventest.tests;

import io.github.maventest.pageObjects.Draggable;
import io.github.maventest.pageObjects.GooglePage;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import ru.stqa.selenium.factory.WebDriverPool;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;


public class DraggablePageTest {

    private WebDriver driver;

    @AfterAll
    public static void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

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
    public void test() {
        doSomething();
    }

    private void doSomething() {
        driver.get("http://demoqa.com/draggable/");
        Draggable draggable = new Draggable(driver);
        Actions actions = new Actions(driver);
        actions.clickAndHold(draggable.getDefaultFunctionalityButton())
                .moveByOffset(410,29)
                .perform();


       // assertThat(draggable.getDefaultFunctionalityButton(), equalTo());
       // assertNotNull(googlePage.getLogo(), "Can't find logo element");
    }
}
