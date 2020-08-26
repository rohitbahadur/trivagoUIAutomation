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
	
	public void SearchHotelTest() throws InterruptedException {
		

		homepage.enterHotelname();
		homepage.selectFromCalendermonth();
		homepage.selectToCalenderMonth();
		homepage.clickSearchButton();
		
		listHotels.selectFromlistOfHotelsDisplayed();
		
		System.out.println("Hotel List displayed");
		
		listHotels.clickViewDeal();
		
		System.out.println("view deal");
		
		//listHotels.waitForPageToLoadFully();
		
		Thread.sleep(5000);
		listHotels.selectAngebote();
		
		listHotels.waitForPageToLoadFully();
		
		Assert.assertTrue(true, "trivago.de");

		System.out.println("Browser launched");

	}

	
}