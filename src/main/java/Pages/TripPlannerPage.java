package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Keywords.Constant;

public class TripPlannerPage {
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[1]/div[2]/div[2]/div/span")
	public WebElement closeDisclaimer;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[2]/ul/li[2]/span")
	public WebElement editableView;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[1]/div[2]/span[3]")
	public WebElement editPlan;
	
	@FindBy(xpath="//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[4]/div/div[2]/a[4]/div[1]/div[2]")
	public WebElement addYourDinner;
	
	@FindBy(css="#overview > div > span.icon-angle-right.trip-overview-next")
	public WebElement nextDay;
	
	
	@FindBy(xpath="/html/body/main/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/ul/li[1]/div[1]/div/span")
	public WebElement addPlan;
	
	@FindBy(xpath="//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[2]/div/div[2]/a[1]/div[1]/span")
	public WebElement change;
	
	@FindBy(xpath="/html/body/main/div[3]/div/div/div/div[2]/div/div[2]/div[3]/div[1]/div/ul[2]/li[2]/div[1]/span[1]/label/span")
	public WebElement flyPuneToParis;
	
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[1]/div[2]/div[1]/span")
	public WebElement savePlan;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[1]/div[2]/div[1]/div/ul/li[1]/span")
	public WebElement saveAsDraft;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/div[1]/div[2]/div[1]/div/ul/li[2]/span")
	public WebElement finishPlanning;
	
	@FindBy(xpath="/html/body/main/div[3]/div/div/div/div[1]")
	public WebElement closeRating;
	
	public void clickOnCloseRating() {
		closeRating.click();
	}
	public void closeDisclaimer() {
		closeDisclaimer.click();
	}
	public void clickOnEditableView() {
		editableView.click();

	}
	public void clickOnNextDay() {
		nextDay.click();
	}
	public void clickOnAddDinner() {
		addYourDinner.click();

	}
	public void clickOnAddPlan() {
		addPlan.click();

	}
	public void clockOnEditPlan() {
		editPlan.click();
	}
	public void clickOnChange() {
		change.click();

	}
	public void clickOnFlyPuneToParis() {
		 flyPuneToParis.click();

	}
	public void clickOnSavePlan() {
		savePlan.click();

	}
	public void selectSaveAsDraft() {
		saveAsDraft.click();
	}
	public void selectFinishPlanning() {
		finishPlanning.click();

	}
	public void SelectDay() {
		java.util.List<WebElement> dayList=Constant.driver.findElements(By.xpath("//*[@id=\"overview\"]/div/div/ul/li[1]/div/div[1]/div[1]/p"));
		for(WebElement ele:dayList)
		{
		      System.out.println(ele.getText());
		      if(ele.getText().contains("Day 5"))
		      {
		    	  	ele.click();
		             System.out.println(ele.getText());
		      }
		}

	}
}
