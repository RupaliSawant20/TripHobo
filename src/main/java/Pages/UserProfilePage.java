package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage {
	@FindBy(xpath="//*[@id=\"js_city_next_step_title\"]")
	public WebElement nextOverview;
	
	@FindBy(xpath="	//*[@id=\"screen-wrapper\"]/div[3]/div/section/div/div[3]")
	public WebElement vacationWidFamily;

	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div/div[3]/div[2]/div[1]/div/div[1]/div/div[3]/div/span[3]")
	public WebElement adults;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[3]/div/span[3]")
	public WebElement kids;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div")
	public WebElement year;
	
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/ul/li[3]/span")
	public WebElement kidsYear;
	
	@FindBy(xpath="//*[@id=\"js_city_step_next\"]")
	public WebElement next_trip_overview;
	//*[@id="js_city_step_next"]
	public void clickOnNextOverview() {
		nextOverview.click();

	}
	public void clickOnVacationWidFamily() {
		vacationWidFamily.click();

	}
	
	public void clickOnAdultPlus() {
		adults.click();
	}
	
	public void clickOnKidsPlus() {
		kids.click();
	}
	public void clickOnYear() {
		year.click();

		
	}
	public void clickOnKidsYear() {
		kidsYear.click();

	}

}
