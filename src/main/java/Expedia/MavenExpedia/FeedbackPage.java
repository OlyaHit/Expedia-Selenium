package Expedia.MavenExpedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackPage {

	public FeedbackPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath = "//div[@class='websitefeedback']")
public WebElement websitefeedback;

@FindBy(xpath ="//a[@id='rater_4']")
public WebElement ratePlus;

@FindBy(xpath = "//textarea[@id='comment_box']")
public WebElement commentField;

@FindBy(xpath = "//input[@id='answer_4289768_10']")
public WebElement checkboxLike;
	
@FindBy(xpath ="//button[@id='submit_button']")
public WebElement submitFeedbackButton;

@FindBy(xpath ="//div[@class='shell']/h1[@id='tyHeader']")
public WebElement thanksMessage;
	
}
