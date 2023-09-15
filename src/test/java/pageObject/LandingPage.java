package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@class='search-keyword']")
	private WebElement searchBox;

	@FindBy(xpath = "//h4[@class='product-name']")
	private WebElement productName;

	@FindBy(xpath = "//a[text()='Top Deals']")
	private WebElement topDealLnk;

	@FindBy(xpath = "//a[@class='increment']")
	private WebElement increment;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCartBtn;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchItem(String name) {
		this.searchBox.sendKeys(name);
	}

	public String getProductName() {
		return productName.getText();
	}

	public void clickTopDeal() {
		topDealLnk.click();
	}

	public String getTitleOfLandingPage() {
		return driver.getTitle();
	}

	public void incrementQuantity(int quantity) {
		int i = quantity;
		while (i > 1) {
			increment.click();
			i--;
		}
	}

	public void addToCartBtn() {
		addToCartBtn.click();
	}
}
