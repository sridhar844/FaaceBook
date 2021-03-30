package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\Sridhar\\eclipse-workspace\\com.facebook.cucumber\\Features\\MyTest.feature",
glue={"StepDefinitions"},
plugin = { "pretty","html:test-output"},
dryRun = true
)

public class Runner {

}
