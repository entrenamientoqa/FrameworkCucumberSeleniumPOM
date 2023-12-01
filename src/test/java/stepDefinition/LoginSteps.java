/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package stepDefinition
 * Contains classes that perform step definitions that are linked to specific scenarios in feature files.
 */

package stepDefinition;

import io.cucumber.java.en.*;
import models.LoginModel;

import static pageObjects.HomePage.*;
import static pageObjects.LoginPage.*;
import static stepDefinition.Hooks.user;

public class LoginSteps {

    public static LoginModel login = new LoginModel();

    @Given("Application login url")
    public void applicationLoginUrl(){
        user.openEcommerce();
    }

    @When("User enter name {}")
    public void userEnterName(String userName) {
        login.setUsername(userName);
        user.sendKeys(txtName, login.getUsername());
    }

    @And("User enter password {}")
    public void userEnterPassword(String userPassword) {
        login.setPassword(userPassword);
        user.sendKeys(txtPassword, login.getPassword());
    }

    @And("User click button login")
    public void userClickButtonLogin() {
        user.click(btnLogin);
    }

    @Then("Home page is presented")
    public void homePageIsPresented() {
        user.validateText(txtTittle, "Products");
    }
}
