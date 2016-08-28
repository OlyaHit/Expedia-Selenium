package Expedia.MavenExpedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends HomePage {

	public DealsPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='modalCloseButton']")
	public WebElement closeButton;
	
	//For Firefox
//	@FindBy(xpath = "//a[@id='tab-cruise-tab']")
//	public WebElement cruiseTab;
	
	@FindBy(xpath = "//a[@id='primary-header-deals']")
	public WebElement deals;
	
	@FindBy(xpath = "//a[@id='cruise-tab']")
	public WebElement cruiseTab;
	
	
//	@FindBy(xpath ="//select[@id='cruise-destination']")
//	public WebElement goingToDropdown;
//	
//	@FindBy(xpath="//select[@id='cruise-departure-month']")
//	public WebElement departureDateDropdown;
	
	
	@FindBy(xpath ="//select[@id='cruise-goingto']")
	public WebElement goingToDropdown;
	
	@FindBy(xpath="//select[@id='cruise-drd']")
	public WebElement departureDateDropdown;	
	
	
	@FindBy(xpath ="//button[@id='cruise-searchButton']")
	public WebElement cruisesearchButton;
}
