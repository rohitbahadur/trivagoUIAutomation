package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCookiePopUp extends WaitForPagesToLoad {
	
	private WebElement cookiePopUp() {

		return browser.findElement(By.xpath("//section[@id='js_item_list_section']"));
	}

	

}
