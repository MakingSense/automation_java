package utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static utils.Config.getChromeDriverPath;
import static utils.Config.getFireFoxDriverPath;

public class MyDriver {

    private WebDriver driver;

    /**
     * This constructor creates an instance of the webdriver according to the broswer selected to run the tests
     * @param browser
     */
    public MyDriver(String browser) {

        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", getFireFoxDriverPath());
                FirefoxDriverManager.firefoxdriver().getDownloadedVersion();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
                driver = new ChromeDriver();
                break;
            default:
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
    }

    /**
     * @return an instance of the webdriver
     */
    public WebDriver getDriver() {
        return driver;
    }
}
