package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import setup.DriverSetUp;
import trivagoPages.DisplayHotelsListPage;
import trivagoPages.HomePage;

public class SearchHotels extends DriverSetUp {

	HomePage homepage = new HomePage();
	DisplayHotelsListPage listHotels = new DisplayHotelsListPage();
	
	
	WebDriver browser;

	@Test(description= "Search Hotel in Hamburg")
	
	public void SearchHotelTest() {
		 
		  CharSequence expectedTitle = trivago;
		 

		homepage.enterHotelname();
		homepage.selectFromCalendermonth();
		homepage.selectToCalenderMonth();
		homepage.clickSearchButton();
		
		listHotels.selectFromlistOfHotelsDisplayed();
		
		Assert.assertEquals(browser.getCurrentUrl().contains(expectedTitle));

		System.out.println("Browser launched");

	}

	
}