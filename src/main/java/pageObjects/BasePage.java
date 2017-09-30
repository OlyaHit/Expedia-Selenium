package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	/*
	 * Header and Footer that are the same for all pages should be implemented here
	 */
}
