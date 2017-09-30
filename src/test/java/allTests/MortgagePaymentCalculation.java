package allTests;

import static helpers.WebLibrary.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.ITestListener;
import org.testng.annotations.*;

import businessFunctions.MortgageCalculation;
import helpers.DriverFactory;
//import helpers.TestListenerAdapter;
import io.qameta.allure.*;

@Feature("Mortgage Payment Calculator")
@Story("Mortgage Payment Calculation using Purchase price")
public class MortgagePaymentCalculation {
	public static WebDriver driver;
	public MortgageCalculation mortgageCalculation;
	public String baseUrl = "https://ia.ca";

	@Parameters({ "browser" })
	@BeforeClass
	public void setUp(String browser) {
		driver = DriverFactory.getBrowser(browser);
		mortgageCalculation = new MortgageCalculation(driver);
		System.out.println("launching firefox browser");
		setUpDriver(driver, 15);
	}
	
//	@BeforeMethod
//	public void beforeMethod() {
//		ITestListener listener = new TestListenerAdapter(driver);
//	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = '0', description = "Verification of Purchase Price Slider work")
	public void verifyPurchasePriceSliderWork() {
		goToUrl(driver, baseUrl);
		System.out.println("loansDropDown");
		mortgageCalculation.clickLoansMenu();
		System.out.println("mortgagesLink");
		mortgageCalculation.clickMortgagesLink();
		System.out.println("calculateYourPaymentsButton");
		mortgageCalculation.clickCalculateYourPaymentsButton();
		System.out.println("purchasePriceSlider");
		mortgageCalculation.movePurchasePriceSliderToRight(driver, 30);
		int actualResult = Integer.parseInt(mortgageCalculation.getPurchasePrice("value"));

		Assert.assertTrue(actualResult > 0, "Slider is not moved");
	}

	@Test(priority = '1', description = "Verification of Mortgage Weekly payments calculation")
	public void verifyMortgageWeeklyPaymentsCalculation() {
		goToUrl(driver, baseUrl);
		System.out.println("loansDropDown");
		mortgageCalculation.clickLoansMenu();
		System.out.println("mortgagesLink");
		mortgageCalculation.clickMortgagesLink();
		System.out.println("calculateYourPaymentsButton");
		mortgageCalculation.clickCalculateYourPaymentsButton();
		System.out.println("plusButtonOfPurchasePriceSlider");
		mortgageCalculation.setPurchasePriceOnSliderByPlusButton(2);
		System.out.println("plusButtonOfdownPaymentSlider");
		mortgageCalculation.setDownPaymentOnSliderByPlusButton(1);
		System.out.println("selectYearsOfAmortization");
		mortgageCalculation.selectYearsOfAmortization("15 years");
		System.out.println("weekly");
		mortgageCalculation.selectPaymentFrequency("weekly");
		mortgageCalculation.setInterestRate("5");
		mortgageCalculation.clickCalculateButtonForMortgagePayment();
		String expectedResult = "$ 726.35";
		mortgageCalculation.waitForPaymentResult(driver, 15);
		String actualResult = mortgageCalculation.getPaymentResult();

		Assert.assertEquals(actualResult, expectedResult + "123", "Weekly Payment Results is wrong");
	}
}
