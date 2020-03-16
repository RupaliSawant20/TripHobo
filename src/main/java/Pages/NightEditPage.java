package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NightEditPage {
	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[1]/div/div/div/div[2]")
	public WebElement Nights;
	
	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div")
	public WebElement ArriveTime;
	
	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/ul/li[2]/span")
	public WebElement MorningTime;
	

	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div/div")
	public WebElement DepartTime;
	
	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[4]/span")
	public WebElement AfterTime;
	
	@FindBy(xpath="//*[@id=\"city-sortable\"]/li/div/div[2]/div[2]/div/div[2]/span")
	public WebElement Save;
	
	@FindBy(xpath="//*[@id=\"js_city_next_step_title\"]")
	public WebElement nextPreferences;
	
	public void clickOnNights() {
		Nights.click();
	}
	public void clickOnArriveTime() {
		ArriveTime.click();
	}
	public void selectMorningTime() {
		MorningTime.click();
	}
	public void clickOnDepartTime() {
		DepartTime.click();
	}
	public void selectAferTime() {
		AfterTime.click();
	}
	public void clickOnSaveBtn() {
		Save.click();
	}
	public void clickOnNextPreferences() {
		nextPreferences.click();
	}
}
