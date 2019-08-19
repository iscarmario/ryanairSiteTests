package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports",
                "junit:target/cucumber-reports/Cucumber.xml",
                "json:target/cucumber-reports/Cucumber.json",
                "pretty"},
        features = {"src/test/resources/functionalTests"},
        glue = {"stepDefinitions"}
)

public class testRunner {
}
