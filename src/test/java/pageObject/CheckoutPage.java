package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;

	@FindBy(xpath = "//img[@alt='Cart']")
	private WebElement cartBag;

	@FindBy(xpath = "//button[contains(text(),'PROCEED')]")
	private WebElement checkOutBtn;

	@FindBy(xpath = "//p[@class='product-name']")
	private WebElement productName;

	@FindBy(xpath = "//button[@class='promoBtn']")
	private WebElement promoBtn;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderBtn;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkOutItem() {
		cartBag.click();
		checkOutBtn.click();
	}

	public boolean verifyPromoBtn() {
		return promoBtn.isDisplayed();
	}

	public boolean verifyPlaceOrder() {
		return placeOrderBtn.isDisplayed();
	}

	public String verifyProductName() {
		return productName.getText();
	}
}
