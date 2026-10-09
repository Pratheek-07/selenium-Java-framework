package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/login.feature",
        glue = "StepDefinition",
        plugin = {"json:target/cucumber.json"})
                   // tags = "@Smoke")

    public class TestNgRunner extends AbstractTestNGCucumberTests {

    }


