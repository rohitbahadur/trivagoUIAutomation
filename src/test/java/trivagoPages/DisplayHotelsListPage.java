package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitForPagesToLoad;

public class DisplayHotelsListPage extends WaitForPagesToLoad {

	private WebElement allHotelsDisplayed() {

		return browser.findElement(By.xpath("//div/section[@id='js_item_list_section']"));
	}

	public void selectFromlistOfHotelsDisplayed() {

		waitForElementToBeClickable(browser, allHotelsDisplayed());

		Actions as = new Actions(browser);
		as.moveToElement(allHotelsDisplayed()).click().build().perform();

		List<WebElement> hotelsList = allHotelsDisplayed()
				.findElements(By.xpath("//div[@class ='accommodation-list__wrap--f43c0']"));

		for (WebElement fromHotelsList : hotelsList) {
			fromHotelsList.getText();
			break;
		}

	}

	private WebElement viewDeal() {

		return browser.findElement(By.xpath("//button[@data-qa='cheapest-deal']"));
	}

	public void clickViewDeal() {

		waitForElementToBeClickable(browser, viewDeal()).click();

	}

	private WebElement angebote() {

		return browser.findElement(By.xpath("//div[contains(@class,'slideouts__container')]"));
	}

	public void selectAngebote() {

		waitForElementToBeClickable(browser, angebote()).click();

	}

	public void waitForPageToLoadFully() {

		waitForpageToLoad(browser);
	}

}
