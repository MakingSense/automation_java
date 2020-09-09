package utils;

public class Config {
    /**
     * These are some variables set to use depending on the browser and the URL required for the project
     * In order to use different URL (depending on the environment) you need to change the environment variables
     */
    private static String URL_ENV = System.getenv("URL_ENV");
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static String chromeDriverPath = System.getenv("CHROME_DRIVER_PATH");
    private static String fireFoxDriverPath = System.getenv("FIREFOX_DRIVER_PATH");

    /**
     * Change this method to return the required environment's URL
     * @return this method reutns the URL
     */
    public static String getUrl() {
        return URL_ENV;
    }

    /**
     * When instantiating a webdriver, use this method to set the desired browser to test: Firefox
     * @return String firefox
     */
    public static String getFirefox() {
        return FIREFOX;
    }

    /**
     * When instantiating a webdriver, use this method to set the desired browser to test: Google Chrome
     * @return String chrome
     */
    public static String getChrome() {
        return CHROME;
    }

    /**
     *
     * @return The chrome webdriver binary path set as environment variable
     */
    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    /**
     *
     * @return The firefox webdriver binary path set as environment variable
     */
    public static String getFireFoxDriverPath() {
        return fireFoxDriverPath;
    }
}
