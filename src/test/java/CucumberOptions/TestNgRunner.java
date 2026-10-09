package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/login.feature",
                    glue = "StepDefinition")
                   // tags = "@Smoke")

    public class TestNgRunner extends AbstractTestNGCucumberTests {

    }