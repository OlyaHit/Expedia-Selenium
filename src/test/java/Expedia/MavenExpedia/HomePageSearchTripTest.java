package Expedia.MavenExpedia;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import static Expedia.MavenExpedia.WebLibrary.*;
import Expedia.MavenExpedia.HomePage;
import Expedia.MavenExpedia.TripSearchResultsPage;



public class HomePageSearchTripTest {

public static WebDriver driver;
static ChromeOptions options;
HomePage homepage;
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
//	driver = new ChromeDriver(); 
	driver.manage().deleteAllCookies();
	homepage = new HomePage(driver);
	tripSearchResultPage = new TripSearchResultsPage(driver);
	goToUrl(driver, "https://www.expedia.com/");
	}


@Test
public void bundleDealsflightPlusHotelSearchTest() {
	System.out.println("Go to page");
	System.out.println("Click on bundleDealsTab");
	clickWebElement(homepage.bundleDealsTab);
	
	System.out.println("Click on flightHotelRadioButton");
	setRadioButtonState(homepage.flightHotelRadioButton, "selected");
	System.out.println("Click on flying from combobox");
	cklickComboBox(homepage.originComboBox);
	
	System.out.println("Type Kiev");
	setTextIntoWebElement(homepage.originComboBox,"Kiev, Ukraine (KBP-Borispol Intl.)");
	
	System.out.println("Click on flying to combobox");
	cklickComboBox(homepage.destinationComboBox);
	System.out.println("Type london");
	setTextIntoWebElement(homepage.destinationComboBox,"London (and vicinity), England, United Kingdom");

	System.out.println("click on departing calendar");
	clickWebElement(homepage.departingComboBox);
	System.out.println("select on departing date");
	clickWebElement(homepage.startDateofTrip);
	
	System.out.println("click on returning calendar");
	clickWebElement(homepage.returningComboBox);
	System.out.println("select on returning date");
	clickWebElement(homepage.endDateofTrip);
	
	
	System.out.println("Select adults 3");
	Select select1 = new Select (homepage.adultsDropDown);
	select1.selectByValue("3");
	
	System.out.println("Select children 1");
	Select select2 = new Select(homepage.childrenDropDown);
	select2.selectByValue("1");
	
	System.out.println("Click Children age");
	Select select3 = new Select(homepage.childrenAgeDropDown);
	System.out.println("Children age");
	select3.selectByValue("1");
	System.out.println("Click on searchButton");
	clickButton(homepage.searchButton);
	
	System.out.println("Wait for search results");
	waitElementPresent(driver,30,tripSearchResultPage.HotelSearchResults.get(1));
	int resultOfSearch = tripSearchResultPage.HotelSearchResults.size();
	System.out.println("Search results is " + resultOfSearch);

	
	Assert.assertTrue("Search results is" + resultOfSearch + "should be more than 0", resultOfSearch>0);
}


@Test 
public void flightsRoundtripSearchTest (){
	System.out.println("Go to page");
	System.out.println("Click on flightsTab");
	clickWebElement(homepage.flightsTab);
	
	System.out.println("Click on roundtripRadioButton");
	setRadioButtonState(homepage.roundtripRadioButton, "selected");
	System.out.println("Click on flying from combobox");
	cklickComboBox(homepage.originComboBox);
	
	System.out.println("Clear info in flying from field ");
	clearTextField(homepage.originComboBox);
	System.out.println("Type Kiev");
	setTextIntoWebElement(homepage.originComboBox,"Kiev, Ukraine (KBP-Borispol Intl.)");

	System.out.println("Click on flying to combobox");
	cklickComboBox(homepage.destinationComboBox);
	System.out.println("Clear info in flying to field ");
	clearTextField(homepage.destinationComboBox);

	System.out.println("Type london");
	setTextIntoWebElement(homepage.destinationComboBox,"London (and vicinity), England, United Kingdom");

	System.out.println("click on departing calendar");
	clickWebElement(homepage.departingComboBox);
	System.out.println("select on departing date");
	clickWebElement(homepage.startDateofTrip);
	
	System.out.println("click on returning calendar");
	clickWebElement(homepage.returningComboBox);
	System.out.println("select on returning date");
	clickWebElement(homepage.endDateofTrip);

	setCheckBoxState(homepage.addHotelCheckbox, "checked");
	
	System.out.println("Select  adults 4");
	Select adults = new Select (homepage.adultsDropDown);
	adults.selectByValue("4");
	
	System.out.println("Click on searchButton");
	clickButton(homepage.searchButton);
	
	System.out.println("Wait for search results");
	waitElementPresent(driver,30,tripSearchResultPage.HotelSearchResults.get(1));
	int resultOfSearch = tripSearchResultPage.HotelSearchResults.size();
	System.out.println("Search results is " + resultOfSearch);

	
	Assert.assertTrue("Search results is" + resultOfSearch + "should be more than 0", resultOfSearch>0);
	
}

}
