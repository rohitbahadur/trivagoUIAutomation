
package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitForPagesToLoad;

public class HomePage extends WaitForPagesToLoad {

//	public static WebElement element = null;

	/* Returns the Hotel namen element on landing page */

	private WebElement hotelname() {
		element = browser.findElement(By.name("sQuery"));
		return element;
	}

	/* Action performed on login button element on landing page */

	public void enterHotelname() {

		waitForElementToBeClickable(browser, hotelname()).sendKeys("Hamburg", Keys.ENTER);

	}

	private WebElement fromCalendermonth() {
		element = browser.findElement(By.xpath("//div[@key='df-over']"));
		return element;
	}

	public void selectFromCalendermonth() {

		waitForElementToBeClickable(browser, hotelname());

		Actions as = new Actions(browser);
		as.moveToElement(fromCalendermonth()).click().build().perform();

		List<WebElement> fromAllValidDates = element
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement fromDate : fromAllValidDates) {
			fromDate.click();
			break;
		}

	}

	private WebElement toCalendermonth() {
		element = browser.findElement(By.xpath("//button[@class='cal-btn-next']/following-sibling::div[1]"));
		return element;
	}

	public void selectToCalenderMonth() {
		waitForElementToBeClickable(browser, toCalendermonth());

		List<WebElement> toAllValidDates = element
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement toDate : toAllValidDates) {
			if (toDate.getText().equals("09")) {
				toDate.click();
				break;
			}
		}

	}
	
	private WebElement searchButton() {
		
		element = browser.findElement(By.xpath("//button/span[text()='Suchen']"));
		return element;
	}

	public void clickSearchButton() {
		waitForElementToBeClickable(browser, searchButton()).click();
	}


}
