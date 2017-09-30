package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResidentialMortgagesPage extends IndividualsPage {
	public ResidentialMortgagesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(., 'Calculate your payments')]")
	public WebElement calculateYourPaymentsButton;
}
