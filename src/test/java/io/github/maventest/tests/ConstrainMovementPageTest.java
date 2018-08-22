package io.github.maventest.tests;

import io.github.maventest.pageObjects.ConstrainMovementPage;
import io.github.maventest.pageObjects.Draggable;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import ru.stqa.selenium.factory.WebDriverPool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConstrainMovementPageTest {


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
        // driver.get("http://demoqa.com/draggable/");
        ConstrainMovementPage constrainMovementPage = new ConstrainMovementPage(driver);
        Actions actions = new Actions(driver);
        constrainMovementPage.getConstrainMovementButton().click();
        actions.clickAndHold(constrainMovementPage.getDragVerticallyButton())
                .moveByOffset(810,29)
                .release()
                .perform();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // assertThat(draggable.getDefaultFunctionalityButton(), equalTo());
        // assertNotNull(googlePage.getLogo(), "Can't find logo element");
    }
}
