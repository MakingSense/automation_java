package utils;

import org.joda.time.DateTime;
import org.testng.Reporter;

public class Logger {

    /**
     * The variables defined to format the logs
     */
    private static final String DATEPATTERN = "MM-dd-yyyy HH:mm:ss ZZ";
    private static final String LOGTEMPLATE = "[%s %s] %s";

    /**
     * Printing message in INFO level
     * @param message
     */
    public static void printInfo(String message) {
        String logMessage = String.format(LOGTEMPLATE, "INFO", DateTime.now().toString(DATEPATTERN), message);
        Reporter.log(logMessage, true);
    }

    /**
     * Printing message in DEBUG level
     * @param message
     */
    public static void printDebug(String message) {
        String logMessage = String.format(LOGTEMPLATE, "DEBUG", DateTime.now().toString(DATEPATTERN), message);
        Reporter.log(logMessage, true);
    }

    /**
     * Printing message in WARNING level
     * @param message
     */
    public static void printWarning(String message) {
        String logMessage = String.format(LOGTEMPLATE, "WARN", DateTime.now().toString(DATEPATTERN), message);
        Reporter.log(logMessage, true);
    }

    /**
     * Printing message in ERROR level
     * @param message
     */
    public static void printError(String message) {
        String logMessage = String.format(LOGTEMPLATE, "ERROR", DateTime.now().toString(DATEPATTERN), message);
        Reporter.log(logMessage, true);
    }
}
