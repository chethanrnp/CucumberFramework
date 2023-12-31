package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".\\src\\test\\java\\feature" }, glue = {
		"stepDefinition" }, monochrome = true, tags = "@Smoke or @Regression", plugin = { "pretty",
				"html:target/cucumber.html", "json:target/cucumber.json"})
public class TestRunner {

	//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
}
