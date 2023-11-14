package org.Google.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"src/test/resources/features"},
        glue = {"org.Google.stepdefinitions"},
      //  dryRun = false,
        tags = "@googleSearch",
        plugin = {"json:target/cucumber.json",
                "html:target/default-report.html"
        }


)
public class TestRunner {
}
