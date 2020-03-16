package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class Keyword {
	

	/**
	 * It opens specified browser.
	 * @param browserName should only include Chrome, Firefox.
	 * No browser apart from mentioned is allowed
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","D:\\newjar\\chromedriver.exe" );
			Constant.driver=new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Rupali\\Firefox\\geckodriver.exe");
			Constant.driver=new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "D:\\Rupali\\IE\\IEDriverServer.exe");
			Constant.driver=new InternetExplorerDriver();
			break;
		default:
			break;
		}
	}
	/**
	 * It opens specified url in web browser recently opened by driver instance
	 * @param url {@code String} url to open
	 * @return void
	 */
	public static void openURL(String url) {
		Constant.driver.get(url);
	}
	
	/**
	 * This method get Title of specified web page.
	 * @return {@code String}
	 */
	public static String getTitle() {
		return Constant.driver.getTitle();
	}
	public static String getCurrentUrl() {
		return Constant.driver.getCurrentUrl();
	}
	/**
	 * This method return specified web element from specified browser
	 * @param locatorType should include css,xpath
	 * @param locatorValue 
	 * @return web element
	 */
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element=null;
	switch (locatorType) {
	case "css":
		element=((RemoteWebDriver) Constant.driver).findElementByCssSelector(locatorValue);
		break;
	case "xpath":
		element=((RemoteWebDriver) Constant.driver).findElementByXPath(locatorValue);
		break;

	default:
		break;
	
	}
	return element;
	}
	
	public static void enterText(String locatorType, String locatorValue,String textToEnter) {
		Constant.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getWebElement(locatorType,locatorValue).sendKeys(textToEnter);
	}
	
	public static void clickOnButton(String locatorType, String locatorValue) {
		getWebElement(locatorType,locatorValue).click();
	}
	public static void selectValueFromDropDown(String locatorType,String locatorValue,String textToSelect) {
		WebElement element=getWebElement(locatorType, locatorValue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
		
	}
	public static void maximizeBrowser() {
		Constant.driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		Constant.driver.close();
	}
	public static void closeAllBrowser() {
		Constant.driver.quit();

	}
	public static void waitTime() {
		Constant.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void acceptAlert() {
		Constant.driver.switchTo().alert().accept();
	}
	public static void dismissAlert() {
		Constant.driver.switchTo().alert().dismiss();
	}
	public static void nevigateTo(String url) {
		Constant.driver.navigate().to(url);
	}
	
	
	
}
