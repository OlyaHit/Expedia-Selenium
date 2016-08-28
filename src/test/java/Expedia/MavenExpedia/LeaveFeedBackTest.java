package Expedia.MavenExpedia;

import org.junit.*;
import static Expedia.MavenExpedia.WebLibrary.*;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import Expedia.MavenExpedia.FeedbackPage;
import Expedia.MavenExpedia.BasePage;

public class LeaveFeedBackTest {
	
	static WebDriver driver;
	BasePage basepage;
	FeedbackPage feedbackpage;
	
	@BeforeClass
	public static void beforeClass(){
		driver = new ChromeDriver();
		setUpDriver(driver,25);
	}

	@AfterClass
	public static void afterClass(){
		driver.quit();
	}

	@Before
	public void beforeEach() {
		basepage = new BasePage(driver);
		feedbackpage = new FeedbackPage(driver);
		driver.manage().deleteAllCookies();
		goToUrl(driver, "https://www.expedia.com/");
		}

	@Test
	public void LeaveFeedBackTest() {	
	System.out.println("click support");
	clickButton(basepage.supportButton);
	System.out.println("click feedback");
	clickLink(basepage.feedbackLink);
	
	Set<String> AllWindowHandles = driver.getWindowHandles();
	System.out.println("get parent window");
	String parentWindow = (String) AllWindowHandles.toArray()[0];
	String feedbackWindow = (String) AllWindowHandles.toArray()[1];
	System.out.println("Switching from parent window to feedbackWindow");
	driver.switchTo().window(feedbackWindow);
	
	 System.out.println("click websitefeedback link");
	 clickLink(feedbackpage.websitefeedback);
	 System.out.println("Switching from parent window to child opinionWindow");
	 String opinionWindow = (String) AllWindowHandles.toArray()[1];
	 driver.switchTo().window(opinionWindow);
	 
	 System.out.println("click ratePlus button");
	 clickButton(feedbackpage.ratePlus);
	 System.out.println("type text in commentField ");
	 setTextIntoWebElement(feedbackpage.commentField,"good");
	 
	 System.out.println("click checkbox 10");
	 setCheckBoxState(feedbackpage.checkboxLike,"checked");
	 System.out.println("click submit");
	 clickButton(feedbackpage.submitFeedbackButton);
	 
	 System.out.println("wait for element");
	 waitElementPresent(driver,5,feedbackpage.thanksMessage);
	 System.out.println("Get text from message");
	 String thanksMessage = feedbackpage.thanksMessage.getText();
	 
	 System.out.println("Verify the result: " + thanksMessage);
	 Assert.assertEquals(thanksMessage, "Thank you for your feedback.");
	 
	 System.out.println("close window");
	 driver.close();
	 System.out.println("Switching to parent window");
	 driver.switchTo().window(parentWindow);
	 
}
	
	
}
