package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPreferencesPage {
	@FindBy(xpath="//*[@id=\"js_city_step_next\"]")
	public WebElement next_about_you;
	
	public void clickOnNextButton() {
		next_about_you.click();
	}
}
