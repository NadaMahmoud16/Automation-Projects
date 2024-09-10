package org.example.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org.example.stepDefs",
        tags = "@happy",
        plugin = {
                "pretty",
                "html:Reports/Report.html",
        }

)
public class Runner extends AbstractTestNGCucumberTests {
}
