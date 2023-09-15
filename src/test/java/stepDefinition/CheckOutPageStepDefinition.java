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
import pageObject.CheckoutPage;
import pageObject.LandingPage;
import pageObject.PageObjectManager;
import utils.TestContextSetup;

public class CheckOutPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;

	public CheckOutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("User proceeds to checkout and validate the {string} items in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_name_items_in_checkout_page(String name) throws Throwable {
		Thread.sleep(2000);
		checkoutPage.checkOutItem();
		Thread.sleep(3000);
		// verify the Product Name
		String actualResult = checkoutPage.verifyProductName().split(" ")[0];
		Assert.assertEquals(actualResult, name);
	}

	@Then("Verify the user has ability to enter promocode and place the order")
	public void verify_the_user_has_ability_to_enter_promocode_and_place_the_order() {

		// verify using TestNg Assert Class
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}

}
