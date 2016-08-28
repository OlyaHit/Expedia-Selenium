package Expedia.MavenExpedia;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import Expedia.MavenExpedia.DealsPage;
import Expedia.MavenExpedia.TripSearchResultsPage;

import static Expedia.MavenExpedia.WebLibrary.*;

import java.util.Set;

public class DealsPageSearchTripTest {
	
	static WebDriver driver; 
	static ChromeOptions options;
	DealsPage dealsPage;
	TripSearchResultsPage tripSearchResultPage;

	@BeforeClass
	public static void beforeClass(){
		options = new ChromeOptions();
		//options.addArguments("-incognito");
		options.addArguments("disable-popup-blocking");
		driver = new ChromeDriver(options);
		setUpDriver(driver,20);
	}

@AfterClass
	public static void afterClass(){
		driver.quit();
	}

	@Before
	public void beforeEach() {
		dealsPage = new DealsPage(driver);
		tripSearchResultPage = new TripSearchResultsPage(driver);
		driver.manage().deleteAllCookies();
		goToUrl(driver, "https://www.expedia.com/");
		
		}

	@Test
	public void myScrachpadTest(){
		System.out.println("Go to page");
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		System.out.println("Click on accountButton");
		clickWebElement(dealsPage.accountButton);
		System.out.println("Click on dealsLink");
		clickLink(dealsPage.deals);
		
		System.out.println("Click on cruiseTab");
		clickWebElement(dealsPage.cruiseTab);
		
		System.out.println("Select cruiseDestination");
		Select cruiseDestination = new Select(dealsPage.goingToDropdown);
		cruiseDestination.selectByIndex(1);
		
		System.out.println("Select departureDate");
		clickWebElement(dealsPage.departureDateDropdown);
		Select departureDate = new Select(dealsPage.departureDateDropdown);
		departureDate.selectByIndex(3);
		
		System.out.println("Click on cruises searchbutton");
		clickButton(dealsPage.cruisesearchButton);
		System.out.println("wait for counter");
		waitElementPresent(driver,30,tripSearchResultPage.scratchpadItemscounter);
		String itemcounter = tripSearchResultPage.scratchpadItemscounter.getText();
		
		if (itemcounter.equals("1")) {
			System.out.println("Verify the result of scratchpadItems_first time: " + itemcounter);
			Assert.assertEquals("1", itemcounter);
		} 
		else 
			{
			System.out.println("refresh page");
			driver.navigate().refresh();
			System.out.println("wait for counter");
			waitElementPresent(driver,30,tripSearchResultPage.scratchpadItemscounter);
			
			itemcounter = tripSearchResultPage.scratchpadItemscounter.getText();
			if (itemcounter.equals("1")){
				System.out.println("Verify the result of scratchpadItems_second time: " + itemcounter);
				Assert.assertEquals("1", itemcounter);	
			}
			else {
				System.out.println("counter is empty : " + itemcounter);
				Assert.assertEquals("1", itemcounter);
			} 
		
		}
		
	
	}
	
	
}
