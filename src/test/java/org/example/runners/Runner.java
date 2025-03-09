package org.example.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports"
        },
        features = "src/test/resources/features",
        glue = {"org/example/steps", "org/example/hooks"},
        dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {
}
