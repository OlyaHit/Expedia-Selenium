package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class MortgagePaymentCalculatorPage extends IndividualsPage {

	public MortgagePaymentCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='row']//div[@class='inputSlide-ia clearfix']//div[@class='slider-handle min-slider-handle custom']")
	// '//label[@for="PrixPropriete"]/../..//div[contains(@class, "min-slider-handle")]'
	public WebElement purchasePriceSlider;
	
	@FindBy(id="sliderPrixPropriete")
	public WebElement purchasePriceTextBox;
	
	@FindBy(id="MiseDeFond")
	public WebElement downPaymentTextBox;
	
	@FindBy(id="PrixProprietePlus")
	public WebElement plusButtonOfPurchasePriceSlider;
	
	@FindBy(id="MiseDeFondPlus")
	public WebElement plusButtonOfDownPaymentSlider;
	
	@FindBy(xpath="//label[@for='Amortissement']/following-sibling::div/div[@class='selectric']")
	public WebElement amortizationYearsDropDown;
	
	@FindBy(xpath="//form[@id='form_calculateur_versements']//div[4]/div[1]//div[@class='selectric-scroll']//li")
	public List <WebElement>  amortizationYears;
	
	@FindBy(xpath="//label[@for='FrequenceVersement']/following-sibling::div/div[@class='selectric']")
	//"//form[@id='form_calculateur_versements']/div[5]/div[2]"
	public WebElement paymentFrequencyDropDown;
	
	@FindBy(xpath="//form[@id='form_calculateur_versements']/div[5]//div[3]//ul/li")
	public List<WebElement> paymentFrequencyPeriods;
	
	@FindBy(id="TauxInteret")
	public WebElement interestRateTextBox;
	
	@FindBy(id="btn_calculer")
	public WebElement calculateButtonForMortgagePayment;
	
	@FindBy(id="paiement-resultats")
	public WebElement paymentResult;
}
