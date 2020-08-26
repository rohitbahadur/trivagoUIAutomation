package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import setup.DriverSetUp;
import trivagoPages.HomePage;

public class SearchHotels extends DriverSetUp {

	WebDriver browser;

	@Test(description= "Verify Search Hotel in Hamburg")
	
	public void SearchHotelTest() {

		HomePage homepage = new HomePage();

		homepage.enterHotelname();
		homepage.selectFromCalendermonth();
		homepage.selectToCalenderMonth();
		homepage.clickSearchButton();
		

		System.out.println("Browser launched");

	}

	
}