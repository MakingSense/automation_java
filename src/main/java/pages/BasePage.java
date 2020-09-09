package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * description: This method will relate the page instance and the webdrive instance using the Page factory.
     *              Creates the explicit wait and sets the timeout to 20 seconds.
     * @param pDriver the webdriver instance
     */
    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        wait = new WebDriverWait(pDriver, 30);
        driver = pDriver;
    }

    /**
     * @return the wait object defined in the BasePage constructor.
     */
    public WebDriverWait getWait() {
        return wait;
    }

    /**
     * @return the webdriver instance defined in the BasePage constructor.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * description: Dispose the driver instance used by the suite and liberates the resources.
     */
    public void dispose() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * description: This method will evaluate if a WebElement exists or not in the page.
     * @param element The WebElement that is evaluated.
     * @return boolean according to existence of WebElement or not
     *
     */
    public Boolean doesElementExist(WebElement element) {

        try {

            if (element.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            e.getCause();
        }
        return false;
    }
}
