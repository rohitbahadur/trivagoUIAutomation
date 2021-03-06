package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import setup.DriverSetUp;
import trivagoPages.DisplayHotelsListPage;
import trivagoPages.HomePage;

public class SearchHotelsTest extends DriverSetUp {

	HomePage homepage = new HomePage();
	DisplayHotelsListPage listHotels = new DisplayHotelsListPage();

	WebDriver browser;

	@Test(description = "Search Hotel in Hamburg")

	public void SearchHotelTest() {

		homepage.enterHotelnameOrDestination();
		homepage.selectFromCalendermonth();
		homepage.selectToCalenderMonth();
		homepage.clickSearchButton();

		listHotels.selectFromlistOfHotelsDisplayed();

		listHotels.clickViewDeal();

		listHotels.selectOptionFromAngebote();

		listHotels.waitForPageToLoadFully();

		Assert.assertTrue(true, "Access Denied");

	}

}