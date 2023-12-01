/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package runner
 * Contains classes that act as executors or runners of the tests.
 */

package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        },
        features = "src/test/resources/features/LoginPage.feature",
        glue = "stepDefinition",
        tags = "@RunAll",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class TestRunner {

}
