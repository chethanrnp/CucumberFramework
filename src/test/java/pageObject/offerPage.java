package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class offerPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='search-field']")
	private WebElement searchBox;

	@FindBy(xpath = "//tbody/tr/td[1]")
	private WebElement productName;

	public offerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchItem(String name) {
		this.searchBox.sendKeys(name);
	}

	public String getProductName() {
		return productName.getText();
	}

}
