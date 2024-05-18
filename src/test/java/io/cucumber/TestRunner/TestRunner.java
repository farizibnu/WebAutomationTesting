package io.cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"io.cucumber.StepDefinitions"},
        plugin = {"pretty", "json:target/cucumber.json", "html:test-report.html"}
)
public class TestRunner {
}