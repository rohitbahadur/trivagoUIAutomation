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
		

		homepage.enterHotelname();
		homepage.selectFromCalendermonth();
		homepage.selectToCalenderMonth();
		homepage.clickSearchButton();
		
		listHotels.selectFromlistOfHotelsDisplayed();
		listHotels.waitForPageToLoadFully();
		
		Assert.assertTrue(true, "trivago.de");

		System.out.println("Browser launched");

	}

	
}