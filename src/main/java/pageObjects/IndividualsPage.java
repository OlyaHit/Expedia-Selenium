package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class IndividualsPage extends BasePage {

	public IndividualsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@data-utag-name='loans']")
	public WebElement loansMenu;

	@FindBy(xpath = "//a[@data-utag-name='mortgage_loan']")
	public WebElement mortgagesLink;
}
