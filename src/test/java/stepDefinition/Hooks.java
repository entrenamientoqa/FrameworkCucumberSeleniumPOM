/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package stepDefinition
 * Contains classes that perform step definitions that are linked to specific scenarios in feature files.
 */

package stepDefinition;

import io.cucumber.java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.PropertiesReader;
import utility.WebCommonActions;

public class Hooks {
    public static WebCommonActions user;
    public static PropertiesReader properties = new PropertiesReader();

    @Before
    public void openBrowser(){
        user = new WebCommonActions();
    }

    @After
    public void closeBrowser(){
        user.closerDriver();
    }

    @AfterStep
    public static void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) user.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());
    }
}