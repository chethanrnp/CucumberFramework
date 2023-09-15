package stepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class landingPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public TestContextSetup testContextSetup;
	public LandingPage landingPage;

	public landingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		// Verify the landing page title
		Assert.assertEquals(landingPage.getTitleOfLandingPage(), "GreenKart - veg and fruits kart");
	}

	@When("^User searched with Shortname (.+) and extracted actual name of the Product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String name) throws Throwable {
		// getting the pageObjectManager from TestContextSetup
		landingPage.searchItem(name);
		Thread.sleep(3000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split(" ")[0];
		Thread.sleep(3000);
		landingPage.clickTopDeal();
	}

	@When("^User searched with Shortname (.+) and extracted actual name of the Produc$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_produc(String name) throws Throwable {
		// getting the pageObjectManager from TestContextSetup
		landingPage.searchItem(name);
		testContextSetup.landingPageProductName = landingPage.getProductName().split(" ")[0];
		Thread.sleep(3000);

	}

	@When("Added {string} items of the selected product to the cart")
	public void added_items_of_the_selected_product_to_the_cart(String quantity) throws Throwable {
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCartBtn();
		Thread.sleep(2000);
	}
}
