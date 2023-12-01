/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package driversConfiguration
 * contains classes and methods that take care of initializing and configuring Selenium WebDriver drivers
 */

package driversConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import static stepDefinition.Hooks.properties;
public class WebDriverConfiguration {
    private static WebDriver driver;
    public WebDriverConfiguration() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(properties.getWebWait()));
    }
    public WebDriver getDriver() {
        return driver;
    }
}
