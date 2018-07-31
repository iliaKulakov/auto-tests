package Factory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

        private static ThreadLocal<WebDriverThread> driverThread;

        public static void instantiateDriverObject() {
            driverThread = new ThreadLocal<WebDriverThread>() {
                @Override
                protected WebDriverThread initialValue() {
                    WebDriverThread webDriverThread =
                            new WebDriverThread();
                    return webDriverThread;
                }
            };
        }
        public static WebDriver getDriver() throws Exception {

            return driverThread.get().getDriver();
        }

        public static void quitDriver() throws Exception {
          //  driverThread.get().quit();
            driverThread.get().getDriver().quit();
        }

    public static void main (String args []) throws Exception {
        DriverFactory newd = new DriverFactory();
        getDriver();

    }

    }


