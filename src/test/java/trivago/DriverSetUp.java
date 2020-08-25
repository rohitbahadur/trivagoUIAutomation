package trivago;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	public static WebDriver browser;

	public static void main(String[] args) throws InterruptedException {

//	public static void openBrowser() {

		/*
		 * WebDriverManager.firefoxdriver().setup(); browser = new FirefoxDriver();
		 * 
		 */

		/* setup ChormeDriver using WebDriverManager */

		WebDriverManager.chromedriver().setup();

		browser = new ChromeDriver();
		// browser.navigate().to(ProjectConfig.URL.appUrl);

		browser.get("https://www.trivago.com/");

		browser.manage().window().maximize();

		/*
		 * WebDriverWait wait = new WebDriverWait(browser, 20);
		 * 
		 * wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor)
		 * wd).executeScript("return document.readyState").equals("complete"));
		 */

		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//

		// shift focus on click on cookie button

		// browser.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

		browser.findElement(By.name("sQuery")).sendKeys("Hamburg", Keys.ENTER);

		// get hold of calendar element
		WebElement fromCalendermonth = browser.findElement(By.xpath("//div[@key='df-over']"));

		Actions as = new Actions(browser);
		as.moveToElement(fromCalendermonth).click().build().perform();
		// fromCalendermonth.click();

		List<WebElement> fromAllValidDates = fromCalendermonth
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement fromDate : fromAllValidDates) {

			// if (fromDate.getText().contains("20")) {
			fromDate.click();
			break;
		}

		WebElement toCalendermonth = browser
				.findElement(By.xpath("//button[@class='cal-btn-next']/following-sibling::div[1]"));

		List<WebElement> toAllValidDates = toCalendermonth
				.findElements(By.xpath("//time[contains(@class,'cal-day cal-is-selectable')]"));

		for (WebElement toDate : toAllValidDates) {
			if (toDate.getText().equals("09")) {
				toDate.click();
				break;
			}
		}

		// browser.switchTo().parentFrame();

		// parentWindow.

		//

		// Thread.sleep(6000);

		// shift focus back on main window

		// click on dates field

		// click on search
		browser.findElement(By.xpath("//button/span[text()='Suchen']")).click();
		
		
		
		WebElement viewDeals = browser.findElement(By.xpath("//span[text()='zum Angebot'][2]"));
		
		as.moveToElement(viewDeals).click().build().perform();

		Thread.sleep(5000);
		// WebElement calendermonth =
		// browser.findElement(By.xpath("//table[@class='cal-month']"));

		System.out.println("Done");
		browser.quit();
	}

}
//}
