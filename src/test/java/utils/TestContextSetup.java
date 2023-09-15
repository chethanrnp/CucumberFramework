package utils;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils gnericUtils;

	public TestContextSetup() throws Throwable {
		testBase = new TestBase();
		this.driver = testBase.webDriverManager();
		pageObjectManager = new PageObjectManager(driver);
		gnericUtils = new GenericUtils(driver);
	}
}
