package stepDefinition;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class Hooks {

	public TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@After
	public void afterScenario() {
		testContextSetup.driver.quit();
	}
}
