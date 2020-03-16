package Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Keywords.Constant;
import Keywords.Keyword;


public class TripPage {
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[1]/div/div[1]/div[1]/div/div/div/input")
	public WebElement Where_do_you_want_to_go;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[1]/div/div[2]")
	public WebElement add_Another_Destination;
	
	@FindBy(xpath="//*[@id=\"js-suggestions\"]/div[4]/div[1]/div[2]/ul/li[1]/div/div[1]")
	public WebElement city;
	
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[2]/div/div/span/input")
	public WebElement Start_Date;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[2]/div/div/span[2]/input")
	public WebElement End_Date;
	
	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[2]/div[3]/div/label/span")
	public WebElement Dont_Know_Dates;

	@FindBy(xpath="//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[3]/div/span")
	public WebElement Start_Planning;

	@FindBy(xpath="//*[@id=\"js-suggestions\"]/div[4]/div[1]/div[2]/ul/li[2]/div/div[1]")
	public WebElement Angers;
	
	public void enterWhereDoYouWantToGo(String location) {
		Where_do_you_want_to_go.sendKeys(location);
	}
	public void clickOnAnotherDestination() {
		add_Another_Destination.click();

	}
	public void clickOnSatrtDate() {
		Start_Date.click();
	}
	public void ClickOnEndDate() {
		End_Date.click();
	}
	
	public void clickOnDontKnowDates() {
		Dont_Know_Dates.click();
	}

	public void clickOnStartPlanning() {
		Start_Planning.click();
	}
	public void selectStartDate() {
		Keyword.getWebElement("xpath", "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[3]/a").click();
	
	}
	public void selectEndDate() {
		Keyword.getWebElement("xpath", "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[5]/a").click();
		
	}
	public void clickOnCity() {
		city.click();

	}
	public void selectOptionWithText(String location) {
		java.util.List<WebElement> autoPopulatedList=Constant.driver.findElements(By.xpath("//*[@id=\"js-suggestions\"]/div[3]/div/ul[1]"));
		for(WebElement ele:autoPopulatedList)
		{
		      System.out.println(ele.getText());
		      if(ele.getText().contains(location))
		      {
		    	  	ele.click();
		      }
		}
	}
		public void selectOptionWithCity(String location) {
			java.util.List<WebElement> cityList=Constant.driver.findElements(By.xpath("//*[@id=\"js-suggestions\"]/div[4]/div[1]/div[2]/ul/li"));
			for(WebElement ele:cityList)
			{
			      System.out.println(ele.getText());
			      if(ele.getText().contains(location))
			      {
			    	  List<WebElement> name=Constant.driver.findElements(By.xpath("//*[@id='js-suggestions']/div[4]/div[1]/div[2]/ul/li[2]/div/div[2]"));
			    	  	System.out.println(ele.getText());
			    	  	Angers.click();
			    	  	city.click();
			      }
			}
			/*for(int i=1;i<cityList.size();i++) {
				if(cityList.get(i).getText().contains(location)) {
					Constant.driver.findElements(By.xpath("//*[@id='js-suggestions']/div[4]/div[1]/div[2]/ul/li["+i+"]/div/div[2]"));		
				}
			}*/
			
			
			
			
		}
}