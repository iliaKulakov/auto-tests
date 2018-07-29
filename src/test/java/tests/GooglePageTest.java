package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.*;

public class GooglePageTest {

    private WebDriver driver;
    @Before
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
    public void testGooglePage() {
        // Create an instance of Bmi Calculator Page class
        // and provide the driver
        CopyOfGooglePage  = new
                CopyOfBmiCalcPage(driver);
        // Set Height
        bmiCalcPage.setHeight("181");
        // Set Weight
        bmiCalcPage.setWeight("80");
        // Click on Calculate button
        bmiCalcPage.calculateBmi();
        // Verify Bmi & Bmi Category values
        assertEquals("24.4", bmiCalcPage.getBmi());
        assertEquals("Normal", bmiCalcPage.getBmiCategory());
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
