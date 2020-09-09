package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LandingPage;

public class SearchTest extends BaseTest {

    /**
     * The parameters are set in the suites/suites.xml file
     * To execute the tests that have paremeters set this way you should execute from the suites.xml file instead of
     * Executing directly from this Class
     * @param searchTerm
     */
    @Parameters({"searchTerm"})
    @Test
    public void searchInGoogle(String searchTerm) {
        LandingPage landingPage = getLandingPage();

        landingPage.search(searchTerm);
    }
}
