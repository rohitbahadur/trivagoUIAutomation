package trivagoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class DisplayHotelsListPage extends WaitForPagesToLoad {
	
public static String pagetitle = "trivago.de – Hotelpreise weltweit vergleichen";
	
	private WebElement allHotelsDisplayed() {
		
		return browser.findElement(By.id("js_item_list_section"));
	}

	public void selectFromlistOfHotelsDisplayed() {

		waitForElementToBeClickable(browser, allHotelsDisplayed());

		List<WebElement> hotelsList = allHotelsDisplayed().findElements(By.xpath("//article[contains(@class,'item bg-white')]"));

		for (WebElement fromHotelsList : hotelsList) {
			System.out.println(fromHotelsList.getSize());
			break;
		}

	}


}
