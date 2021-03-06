package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@excel",
        dryRun = false
)

public class Runner {
// JUnit framework is used because @RunWith(Cucumber.class) method that runs the runner class comes with JUnit framework.
}
