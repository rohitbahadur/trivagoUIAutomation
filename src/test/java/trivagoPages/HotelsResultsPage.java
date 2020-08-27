package trivagoPages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import utils.WaitForPagesToLoad;

public class HotelsResultsPage extends WaitForPagesToLoad {

	private WebElement openNewTab() {

		return browser.findElement(By.xpath("//h1"));
	}

	public void moveToNewTab() {

		waitForElementToBeVisible(browser, openNewTab());

		Set<String> handles = browser.getWindowHandles();
		
		for (String windowHandle : handles) {
			if (windowHandle.equals(windowHandle)) {
				browser.switchTo().window(windowHandle);
			}
		}
		Reporter.log("Post this step, the security blocks further execution via automated scripts", true);
	}

}
