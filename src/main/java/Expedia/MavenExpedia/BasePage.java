package Expedia.MavenExpedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	//------------------------------------Header-------------------------------------------------------

	
		@FindBy(xpath = "//a[@id='primary-header-home']")
		public WebElement homeLink;

		@FindBy(xpath = "//a[@id='primary-header-package']")
		public WebElement bundleDealsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-hotel']")
		public WebElement hotelsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-car']")
		public WebElement carsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-flight']")
		public WebElement flightsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-cruise']")
		public WebElement cruiseLink;

		@FindBy(xpath = "//a[@id='primary-header-activity']")
		public WebElement ThingsToDoLink;
		
		@FindBy(xpath = "//a[@data-key='deals']")
		public WebElement dealsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-rewards']")
		public WebElement rewardsLink;
		
		@FindBy(xpath = "//a[@id='primary-header-rewards']")
		public WebElement mobileLink;
		
		@FindBy(xpath = "//div[@id='user-alerts-menu']//button[contains(@class,'trigger-link')]")
		public WebElement alertButton;
		
		@FindBy(xpath = "//a[@id='header-account-menu']")
		public WebElement accountButton;
		
		//NOTE: (if signinButton is displayed - click, else click on accountButton, click on signinButton)
		@FindBy(xpath = "//button[@id='header-account-signin-button']")
		public WebElement signinButton;
		
		//NOTE:(if createAccountLink is displayed - click, else click on accountButton, click on createAccountLink)
		@FindBy(xpath = "//a[@id='header-account-register']")
		public WebElement createAccountLink;
		
		@FindBy(xpath = "//a[@id='header-history']")
		public WebElement myScratchpadButton;
		
		//NOTE:element is displayed after click on myScratchpadButton
		@FindBy(xpath = "//a[contains(@class,'view-all-history')]")
		public WebElement viewScratchpadLink;
		
		@FindBy(xpath = "//a[@id='header-itineraries']")
		public WebElement myTripsButton;
		
		@FindBy(xpath = "//a[@id='header-support-menu']")
		public WebElement supportButton;
		
		//NOTE:element is displayed after click on supportButton
		@FindBy(xpath = "//a[@id='header-support-cs']")
		public WebElement customerSupportLink;
		
		//NOTE:element is displayed after click on supportButton
		@FindBy(xpath = "//a[contains(@id,'feedback')]")
	
		public WebElement feedbackLink;
		
		//Element for selecting Spanish
		@FindBy(xpath = "//a[@id='header-language-2058']")
		public WebElement spanishLanguageLink;
		
		//Element for selecting Chinese Language
		@FindBy(xpath = "//a[@id='header-language-2052']")
		public WebElement chineseLanguagehLink;
		
		//Element for selecting English Language
		@FindBy(xpath = "//a[@id='header-language-1033']")
		public WebElement englishLanguagehLink;

		@FindBy(xpath = "//div[@class='secondary-branding']//img[contains(@alt,'Learn How')]")
		public WebElement learnHowhLink;
		
		
		//----------------------------Footer Block--------------------------------------
		
		@FindBy(xpath = "//div[@id='site-footer-wrap']")
		public WebElement footerWrap;
}
