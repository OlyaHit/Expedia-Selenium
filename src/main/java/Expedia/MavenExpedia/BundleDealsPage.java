package Expedia.MavenExpedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BundleDealsPage extends HomePage {

	public BundleDealsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='wizard-theme-wrapper']//a[@id='tab-flightHotel-tab']")
	public WebElement flightHotelTab;
	
	@FindBy(xpath = "//div[@id='wizard-theme-wrapper']//a[@id='tab-flightHotelCar-tab']")
	public WebElement flightHotelCarTab;
	
	@FindBy(xpath = "//div[@id='wizard-theme-wrapper']//a[@id='tab-flightCar-tab']")
	public WebElement flightCarTab;
	
	@FindBy(xpath = "//div[@id='wizard-theme-wrapper']//a[@id='tab-hotelCar-tab']")
	public WebElement hotelCarTab;

}
