package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class DisplayHotelsListPage extends WaitForPagesToLoad {

	private WebElement allHotelsDisplayed() {

		return browser.findElement(By.id("js_item_list_section"));
	}

	public void selectFromlistOfHotelsDisplayed() {

		waitForElementToBeClickable(browser, allHotelsDisplayed());

		List<WebElement> hotelsList = allHotelsDisplayed()
				.findElements(By.xpath("//div[@class = 'accommodation-list__wrap--f43c0']"));

		for (WebElement fromHotelsList : hotelsList) {
			fromHotelsList.click();
			break;
		}

	}

	private WebElement viewDeal() {

		return browser.findElement(
				By.xpath("//span[@class = 'icon-ic accommodation-list__icon--19c73 icon-center']"));
	}

	public void clickViewDeal() {

		waitForElementToBeClickable(browser, viewDeal()).click();

	}

	
	private WebElement angebote() {

		return browser.findElement(By.xpath("//button[text()='Angebote']"));
	}

	public void selectAngebote() {

		waitForElementToBeClickable(browser, angebote());

		List<WebElement> angeboteDeal = angebote().findElements(By.xpath("//span[@data-qa='slideout-deal-price']"));

		for (WebElement deal : angeboteDeal) {
			deal.click();
			break;
		}

	}

	public void waitForPageToLoadFully() {

		waitForpageToLoad(browser);
	}

}
