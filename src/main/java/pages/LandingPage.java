package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Config.getUrl;

public class LandingPage extends BasePage {

    @FindBy(css = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")
    private WebElement searchInputField;

    /**
     * description: This method will relate the page instance and the webdrive instance using the Page factory.
     * Creates the explicit wait and sets the timeout to 20 seconds.
     *
     * @param pDriver the webdriver instance
     */
    public LandingPage(WebDriver pDriver) {
        super(pDriver);
        pDriver.get(getUrl());
    }

    /**
     * This method is just an example to work with the google page
     * Add all the necessary methods to work with the web application under testing
     * @param term
     */
    public void search(String term) {
        searchInputField.sendKeys(term);
        searchInputField.sendKeys(Keys.ENTER);
    }
}
