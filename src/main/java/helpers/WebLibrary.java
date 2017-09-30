package helpers;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class WebLibrary {

	@Step("Open \"{url}\" page")
	public static void goToUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public static void maximazeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void setImplicitlyWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void waitElementPresent(WebDriver driver,long seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element)); 
	}
	public static void setUpDriver(WebDriver driver, long seconds) {
		maximazeWindow(driver);
		setImplicitlyWait(driver, seconds);
	}

	public static void setValueInDropDown(List<WebElement> elements, String value) {
		for (WebElement allElements : elements) {
			if (allElements.getText().equals(value)) {
				allElements.click();
				break;
			}
		}
	}

	public static void moveSlider(WebDriver driver, WebElement element, int xOffset, int yOffset) {
		new Actions(driver).dragAndDropBy(element, xOffset, yOffset).perform();
	}

	public static void setTextIntoWebElement(WebElement element, String text) {
		element.click();
		clearTextField(element);
		element.sendKeys(text);
	}

	public static void clearTextField(WebElement element) {
		element.clear();
	}

	public static void clickWebElement(WebElement element) {
		element.click();
	}
	public static void clickLink(WebElement link) {
		link.click();
	}

	public static void clickButton(WebElement button) {
		button.click();
	}

}
