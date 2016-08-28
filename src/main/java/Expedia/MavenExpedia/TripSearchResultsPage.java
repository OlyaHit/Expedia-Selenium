package Expedia.MavenExpedia;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripSearchResultsPage extends BasePage {

	public TripSearchResultsPage(WebDriver driver) {
		super(driver);
	
	}
	
	//Search results of trip or hotels
	//@FindBy(xpath= "//div[contains(@class,'box complex hot-listing')]")
	@FindBy (xpath = "//div[contains(@class,'content clearfix')]")
	
	public List<WebElement> HotelSearchResults;
	
	@FindBy(xpath="//span[@id='scratchpad-badge']")
	public WebElement scratchpadItemscounter;
	
	@FindBy(xpath="	//a[@class='item-link']")
	public WebElement scratchpadItemLink;


}
