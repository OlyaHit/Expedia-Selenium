package Expedia.MavenExpedia;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {

		super(driver);
	}

	
	//-------------------Search Block-------------------------------------------
	//----tablist -----
	
	@FindBy(xpath = "//a[@id='tab-flight-tab']")
	public WebElement flightsTab;

	@FindBy(xpath = "//a[@id='tab-hotel-tab']")
	public WebElement hotelsTab;

	@FindBy(xpath = "//a[@id='tab-package-tab']")
	public WebElement bundleDealsTab;
	
	@FindBy(xpath = "//a[@id='tab-car-tab']")
	public WebElement carsTab;
	
	@FindBy(xpath = "//a[contains(@id,'cruise-tab')]")
	public WebElement cruisesTab;
	
	@FindBy(xpath = "//a[@id='tab-activity-tab']")
	public WebElement thingsToDoTab;
	
	@FindBy(xpath = "//a[@id='tab-homeaway-tab']")
	public WebElement vacationRentalsTab;
	
	@FindBy(xpath = "//a[@id='tab-opensearch-tab']")
	public WebElement serchAnythingTab;
	
	
	
	//---------------------------Search Block->--------------------------------------------------------
	
	@FindBy(xpath = "//button[@id='search-button']")
	public WebElement searchButton;
	
	@FindBy(xpath ="//input[@id='flight-type-roundtrip']")
	public WebElement roundtripRadioButton;
	
	
	@FindBy(xpath ="//input[@id='flight-add-hotel-checkbox']")
	public WebElement addHotelCheckbox;
	
	
	@FindBy(xpath ="//label[@name='fh']//input[@type='radio']")
	public WebElement flightHotelRadioButton;
	
	@FindBy(xpath = "//label[@name='fhc']")
	public WebElement flightHotelCarRadioButton;
	
	@FindBy(xpath = "//label[@name='fc']")
	public WebElement flightCarRadioButton;
	
	@FindBy(xpath = "//label[@name='hc']")
	public WebElement hotelCarRadioButton;
	
	//origin of your trip
	@FindBy(xpath = "//input[contains(@id,'origin')]")
	public WebElement originComboBox;
	
	//destination of your trip
	@FindBy(xpath = "//input[contains(@id,'destination')]")
	public WebElement destinationComboBox;
	
	@FindBy(xpath = "//select[contains(@id,'rooms')]")
	public WebElement roomsDropDown;
	
	@FindBy(xpath = "//select[contains(@id,'adults')]")
	public WebElement adultsDropDown;
	
	@FindBy(xpath = "//select[contains(@id,'children')]")
	public WebElement childrenDropDown;
	
	//NOTE:element is displayed after click on childrenDropDown
	@FindBy(xpath = "//select[@id='package-1-age-select-1']")
	public WebElement childrenAgeDropDown;
	
	@FindBy(xpath = "//input[@id='partialHotelBooking']")
	public WebElement partialBookingCheckbox;
	
	@FindBy(xpath = "//a[@id='advanced-options']")
	public WebElement advancedOptionsButton;
	
	//NOTE:element is displayed after click on advanced option
 
	@FindBy(xpath ="//select[contains(@id,'lass')]")
	public WebElement preferredClassDropDown;
	
	//--------------------Calendar-------------------------
	
	@FindBy(xpath = "//input[contains(@id,'departing')]")
	public WebElement departingComboBox;
	
	@FindBy(xpath = "//input[contains(@id,'returning')]")
	public WebElement returningComboBox;
	
	@FindBy(xpath ="//div[@class='datepicker-cal-month'][position()=2]//a[text()='5']")
	public WebElement startDateofTrip;

	@FindBy(xpath ="//div[@class='datepicker-cal-month'][position()=2]//a[text()='10']")
	public WebElement endDateofTrip;
	////div[@class='datepicker-cal-month'][2]//a[text()='10']
	
	//---------------Element for Hotel------------------------------------------------------
	
	@FindBy(xpath = "//input[contains(@id,'checkin')]")
	public WebElement checkinComboBox;
	
	@FindBy(xpath = "//input[contains(@id,'checkout')]")
	public WebElement checkoutComboBox;
	
	
	//---------------------------------Content Block-------------------------------------------------
	
	@FindBy(xpath = "//div[@class='site-content-wrap']")
	public WebElement contentWrap;
	
	//---------------------------Ads Block-----------------------------------------------------
	
	@FindBy(xpath = "//div[@class='ads-wrapper']")
	public WebElement adsWrap;
	
	
	
	
}
