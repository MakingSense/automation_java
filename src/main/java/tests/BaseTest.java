package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LandingPage;
import utils.Logger;
import utils.MyDriver;

import static utils.Config.getChrome;

public abstract class BaseTest {

    MyDriver driver;
    private LandingPage landingPage;

    /**
     * Setting up all the necessary configuration before running the tests
     * Using beforeClass so it is executed before every test Class defined
     */
    @BeforeClass(alwaysRun = true)
    public void setUp() {

        Logger.printInfo("Before test suite started");

        driver = new MyDriver(getChrome());
        landingPage = new LandingPage(driver.getDriver());
    }

    /**
     * Once the tests inside a Class have been executed, the tear down method is executed
     * In this case, the dispose of the webdriver so it does not use a lot of memory and the session can be cleaned up
     * for the rest of the testing Classes (if there are more)
     */
    @AfterClass
    public void tearDown() {

        Logger.printInfo("After suite started and disposing resources");

        landingPage.dispose();
    }

    /**
     * This method returns an instance of the landing page that should be changed to the project's landing page
     * @return an instance of the entry page
     */
    public LandingPage getLandingPage() {

        Logger.printInfo("Landing page instance returned");

        return landingPage;
    }

}
