//package helpers;
//
//import java.util.List;
//import java.util.logging.Level;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.logging.LogEntry;
//import org.openqa.selenium.logging.LogType;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import io.qameta.allure.Attachment;
//
//public class TestListenerAdapter implements ITestListener {
//	private static WebDriver driver;
////	private List<LogEntry> browserLog, clientLog, serverLog;
//	public TestListenerAdapter(WebDriver driver) {
//		TestListenerAdapter.driver = driver;
//	}
//    
//    @Attachment(value = "Screenshot", type = "image/png")
//    public static byte[] saveScreenshot() {
//        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }
//	@Attachment(value = "HTML Document", type = "text/html")
//	private String getPage() {
//		return driver.findElement(By.cssSelector("html")).getAttribute("innerHTML");
//	}
//	@Attachment(value = "Client Log", type = "text/html")
//	private List<LogEntry> attachClientLog(List<LogEntry> log) {
//		return log;
//	}
//	@Attachment(value = "Server Log", type = "text/html")
//	private List<LogEntry> attachServerLog(List<LogEntry> log) {
//		return log;
//	}
//	@Attachment(value = "Browser Log", type = "text/html")
//	private List<LogEntry> attachBrowserLog(List<LogEntry> log) {
//		return log;
//	}
//    public void onTestFailure(ITestResult result) {
//        saveScreenshot();
//        getPage();
//        
//		clientLog = driver.manage().logs().get(LogType.CLIENT).getAll();
//		serverLog = driver.manage().logs().get(LogType.SERVER).getAll();
//		browserLog = driver.manage().logs().get(LogType.BROWSER).filter(Level.WARNING);
//		
//		if (clientLog.size() > 0) { attachClientLog(clientLog);}
//		if (serverLog.size() > 0) { attachServerLog(serverLog);}
//		if (browserLog.size() > 0) { attachBrowserLog(browserLog);}
//        
//    }
//	public void onTestStart(ITestResult result) {}
//	public void onTestSuccess(ITestResult result) {}
//	public void onTestSkipped(ITestResult result) {}
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
//	public void onStart(ITestContext context) {}
//	public void onFinish(ITestContext context) {}
//}
