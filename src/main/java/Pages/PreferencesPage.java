package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage {
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/ul/li[5]/div/div/div/span")
	public WebElement travelers;
	
	@FindBy(xpath="//*[@id=\"js-adult-incrementer\"]/div/div/span[3]/span")
	public WebElement adults;
	
	@FindBy(xpath="//*[@id=\"js-kids-incrementer\"]/div/div/span[3]/span")
	public WebElement kids;
	
	@FindBy(xpath="//*[@id=\"js_city_next_step_title\"]")
	public WebElement nextOverview;
	
	public void clickOnTravelers() {
		travelers.click();
	}
	
	public void clickOnNextOverview() {
		nextOverview.click();
	}
	public void incementAdults() {
		adults.click();
	}
	public void incrementKids() {
		kids.click();

	}
}
