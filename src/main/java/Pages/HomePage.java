package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	@FindBy(xpath="//a[contains(text(),\"Log In\")]")
	public WebElement LogIn;
	
	@FindBy(xpath="//a[contains(text(),\"Plan Your Next Vacation\")]")
	public WebElement PlanYourNextVacation;
	
	public void clickOnLoginButton() {
		LogIn.click();
	}
	public void clickOnPlanYourNextVacation() {
		PlanYourNextVacation.click();

	}
	
}