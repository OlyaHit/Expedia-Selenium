package businessFunctions;

import static helpers.WebLibrary.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Step;
import pageObjects.MortgagePaymentCalculatorPage;
import pageObjects.ResidentialMortgagesPage;

public class MortgageCalculation {

	public MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage;
	public ResidentialMortgagesPage residentialMortgagesPage;

	public MortgageCalculation(WebDriver driver) {
		mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage(driver);
		residentialMortgagesPage = new ResidentialMortgagesPage(driver);
	}

	@Step("Click Loans Menu")
	public void clickLoansMenu() {
		clickWebElement(mortgagePaymentCalculatorPage.loansMenu);
	}

	@Step("Click Mortgages Link")
	public void clickMortgagesLink() {
		clickLink(mortgagePaymentCalculatorPage.mortgagesLink);
	}

	@Step("Click Calculate Your Payments button")
	public void clickCalculateYourPaymentsButton() {
		clickButton(residentialMortgagesPage.calculateYourPaymentsButton);
	}

	@Step("Move Purchase Price Slider To Right")
	public void movePurchasePriceSliderToRight(WebDriver driver, int xOffset) {
		moveSlider(driver, mortgagePaymentCalculatorPage.purchasePriceSlider, xOffset, 0);
	}

	@Step("Change the Purchase Price using + button of the slider")
	public void setPurchasePriceOnSliderByPlusButton(int clickQuantity) {
		clickPlusButtonForSlider(mortgagePaymentCalculatorPage.plusButtonOfPurchasePriceSlider, clickQuantity);
	}

	@Step("Change the Down Payment using the + button of the slider")
	public void setDownPaymentOnSliderByPlusButton(int clickQuantity) {
		clickPlusButtonForSlider(mortgagePaymentCalculatorPage.plusButtonOfDownPaymentSlider, clickQuantity);
	}

	public void clickPlusButtonForSlider(WebElement element, int clickQuantity) {
		while (clickQuantity > 0) {
			clickButton(element);
			clickQuantity--;
		}
	}

	@Step("Select \"{value}\" years for Amortization")
	public void selectYearsOfAmortization(String value) {
		clickWebElement(mortgagePaymentCalculatorPage.amortizationYearsDropDown);
		setValueInDropDown(mortgagePaymentCalculatorPage.amortizationYears, value);
	}

	@Step("Select \"{value}\" for Payment Frequency")
	public void selectPaymentFrequency(String value) {
		clickWebElement(mortgagePaymentCalculatorPage.paymentFrequencyDropDown);
		setValueInDropDown(mortgagePaymentCalculatorPage.paymentFrequencyPeriods, value);
	}

	@Step("Change the Interest Rate to \"{rate}\"")
	public void setInterestRate(String rate) {
		setTextIntoWebElement(mortgagePaymentCalculatorPage.interestRateTextBox, rate);
	}

	@Step("Click Calculate button")
	public void clickCalculateButtonForMortgagePayment() {
		clickButton(mortgagePaymentCalculatorPage.calculateButtonForMortgagePayment);
	}

	public String getPurchasePrice(String attributeName) {
		return mortgagePaymentCalculatorPage.purchasePriceTextBox.getAttribute(attributeName);
	}

	public String getPaymentResult(){
		return mortgagePaymentCalculatorPage.paymentResult.getText();
	}
	
	public void waitForPaymentResult (WebDriver driver, long seconds){
		waitElementPresent(driver, seconds,mortgagePaymentCalculatorPage.paymentResult );
	}
}
