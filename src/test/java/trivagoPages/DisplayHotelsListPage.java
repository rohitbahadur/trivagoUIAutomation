package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitForPagesToLoad;

public class DisplayHotelsListPage extends WaitForPagesToLoad {
	
	private WebElement fromCalendermonth() {
		element = browser.findElement(By.xpath("//div[@key='df-over']"));
		return element;
	}

	public void selectFromCalendermonth() {

		waitForElementToBeClickable(browser, hotelname());

		List<WebElement> fromAllValidDates = element
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement fromDate : fromAllValidDates) {
			fromDate.click();
			break;
		}

	}


}
