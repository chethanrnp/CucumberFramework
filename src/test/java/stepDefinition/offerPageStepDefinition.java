package stepDefinition;

import java.util.Set;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.PageObjectManager;
import pageObject.offerPage;
import utils.TestContextSetup;

public class offerPageStepDefinition {

	public String offerPageProductName;
	public TestContextSetup testContextSetup;

	public offerPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^User Searched for (.+) shortname in offer page$")
	public void user_searched_for_shortname_in_offer_page(String name) throws Throwable {
		Thread.sleep(3000);
		// getting the pageObjectManager from TestContextSetup
		offerPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
		testContextSetup.gnericUtils.switchToChildWindow();
		offerPage.searchItem(name);
		offerPageProductName = offerPage.getProductName();

	}

	@Then("Validate Product in offer page matches with Landing Page")
	public void validate_product_in_offer_page_matches_with_landing_page() {
		Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
	}

}
