package Factory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverThread {

    private WebDriver webdriver;

    private final String operatingSystem =
            System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture =
            System.getProperty("os.arch");

    public WebDriver getDriver() throws Exception {

        InputStream fis;
        Properties properties = new Properties();
        try {
            fis = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.path"));

        if (null == webdriver) {
            System.out.println(" ");
            System.out.println("Current Operating System: " +
                    operatingSystem);
            System.out.println("Current Architecture: " +
                    systemArchitecture);
            System.out.println("Current Browser Selection: Chrome");
            System.out.println(" ");
            webdriver = new ChromeDriver();
        }
        return webdriver;
    }

        public void quitDriver() {
            if (null != webdriver) {
                webdriver.quit();
            }
        }


}
