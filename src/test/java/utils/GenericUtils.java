package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String lv : allWindow) {
			driver.switchTo().window(lv);
			if (!lv.equals(mainWindow)) {
				driver.switchTo().window(lv);
				break;
			}
		}

	}
}
