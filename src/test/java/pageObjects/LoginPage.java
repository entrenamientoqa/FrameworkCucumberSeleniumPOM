/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package pageObjects
 * Contains classes each page or component of the user interface.
 */

package pageObjects;

import org.openqa.selenium.By;
public class LoginPage  {
    public static By txtName = By.id("user-name");
    public static By txtPassword = By.id("password");
    public static By btnLogin = By.id("login-button");

}
