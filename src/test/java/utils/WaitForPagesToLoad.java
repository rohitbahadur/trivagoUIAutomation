package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.DriverSetUp;

public class WaitForPagesToLoad extends DriverSetUp {
	public static WebElement element = null;

	protected static WebElement waitForElementToBeVisible(WebDriver browser, WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(browser, 60);

		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}

	protected static WebElement waitForElementToBeClickable(WebDriver browser, WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(browser, 60);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

}
