package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy(css=".fb_logo")
	public WebElement logo;
	
	@FindBy(xpath="//*[@id=\"js-top-nav-signin-out\"]/ul/li[2]/a")
	public WebElement log_in;
	
	@FindBy(xpath="/html/body/main/div/div/div/div/div/div/div[2]/div[1]/a")
	public WebElement logWithFacebook;
	
	public void clickOnLogIn() {
		log_in.click();

	}
	public void clickOnLogInWithFacebook() {
		logWithFacebook.click();

	}
	
}