/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package utility
 * Contains classes and methods that provide utility functions or auxiliary services
 * that are used in various places in your automation code.
 */

package utility;

import driversConfiguration.WebDriverConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import static stepDefinition.Hooks.properties;
public class WebCommonActions {
    public static WebDriver driver;

    public WebCommonActions() {
        driver =  new WebDriverConfiguration().getDriver();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void openEcommerce(){
        driver.get(properties.getWebURL());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
    }

    public void sendKeys(By element, String text){
        driver.findElement(element).sendKeys(text);
    }
    public void click(By element){
        driver.findElement(element).click();
    }

    public void validateText(By locator, String text){
        String textOne = driver.findElement(locator).getText();
        Assert.assertEquals(textOne, text);
    }
    public void closerDriver() {
        driver.quit();
    }
}