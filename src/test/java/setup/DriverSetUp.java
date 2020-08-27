package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	/* Initialize WebDriver */

	public static WebDriver browser;

	@BeforeMethod
	public static void openBrowser() {

		
		/* setup ChormeDriver using WebDriverManager */

		WebDriverManager.chromedriver().setup();

		browser = new ChromeDriver();
		
		Reporter.log("Test Initiated",true);
		Reporter.log("Launch chrome browser",true);
		
		browser.get(ProjectConfig.prop.getProperty("baseurl"));
		
		Reporter.log("Open trivago.de page",true);
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public static void closeBrowser() {

		browser.quit();
	}

}
