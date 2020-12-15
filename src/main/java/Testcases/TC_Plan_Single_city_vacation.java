package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Keywords.Keyword;

public class TC_Plan_Single_city_vacation extends Keyword{
	@BeforeMethod
	public void open_browser_and_Url() {
		openBrowser("Chrome");
		
	
		Keyword.waitTime();
		openURL("https://www.triphobo.com");
		Keyword.maximizeBrowser();

	}
	@AfterMethod
	public void close_browser() {
		closeBrowser();

	}
	@Test
	public void test_to_verify_Title_of_TripHobo(){
		Assert.assertEquals(Keyword.getTitle(),"Vacation Planner for Your Holidays: TripHobo","this is not matched");
		String str=Keyword.getTitle();
		System.out.println(str);
	}
}
