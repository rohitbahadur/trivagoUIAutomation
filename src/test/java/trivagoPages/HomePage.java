
package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import utils.WaitForPagesToLoad;

public class HomePage extends WaitForPagesToLoad {

//	public static WebElement element = null;

	/* Returns the Hotel namen element on landing page */

	private WebElement HotelnameOrDestination() {

		return browser.findElement(By.name("sQuery"));
	}

	/* Action performed on login button element on landing page */

	public void enterHotelnameOrDestination() {

		waitForElementToBeClickable(browser, HotelnameOrDestination()).sendKeys("Hamburg", Keys.ENTER);
		Reporter.log("EnterHotelnameOrDestination field is detected and destination name 'Hamburg' is entered", true);
	}

	private WebElement fromCalendermonth() {

		return browser.findElement(By.xpath("//div[@key='df-over']"));

	}

	public void selectFromCalendermonth() {

		waitForElementToBeVisible(browser, fromCalendermonth());

		Actions as = new Actions(browser);
		as.moveToElement(fromCalendermonth()).click().build().perform();

		List<WebElement> fromAllValidDates = fromCalendermonth()
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement fromDate : fromAllValidDates) {
			fromDate.click();
			break;
		}
		Reporter.log("FromCalenderMonth element is detected and date is selected ", true);
	}

	private WebElement toCalendermonth() {

		return browser.findElement(By.xpath("//button[@class='cal-btn-next']/following-sibling::div[1]"));
	}

	public void selectToCalenderMonth() {
		waitForElementToBeClickable(browser, toCalendermonth());

		List<WebElement> toAllValidDates = toCalendermonth()
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement toDate : toAllValidDates) {
			if (toDate.getText().equals("09")) {
				toDate.click();
				break;
			}
		}
		Reporter.log("ToCalenderMonth element is detected and date is selected ", true);
	}

	private WebElement searchButton() {

		return browser.findElement(By.xpath("//button/span[text()='Suchen']"));
	}

	public void clickSearchButton() {
		waitForElementToBeClickable(browser, searchButton()).click();
		Reporter.log("SearchButton element is detected and clicked. This will wait to fetch the hotel list ", true);
	}

}
