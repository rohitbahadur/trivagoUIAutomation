package utils;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.DriverSetUp;

public class WaitForPagesToLoad extends DriverSetUp {

	protected final WebElement waitForElementToBeVisible(WebDriver browser, WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(browser, 60);

		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}

	protected final WebElement waitForElementToBeClickable(WebDriver browser, WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(browser, 60);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}

	
	protected final List<WebElement> waitForElementstoBeAvailable(WebDriver newDriver, List<WebElement> elements) {

		WebDriverWait wait	 = new WebDriverWait(browser,60);

		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			 return list;
	}

	
	  protected final void waitForpageToLoad(WebDriver browser) {
	  
		  WebDriverWait wait =  new WebDriverWait(browser, 60);
	  
	  wait.until(new ExpectedCondition<Boolean>() { public Boolean apply(WebDriver
	  wdriver) { return ((JavascriptExecutor) browser).executeScript(
	  "return document.readyState" ).equals("complete"); } }); }
	 

}
