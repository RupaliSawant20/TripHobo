package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Keywords.Constant;
import Keywords.Keyword;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.NightEditPage;
import Pages.PreferencesPage;
import Pages.TripPage;
import Pages.TripPlannerPage;
import Pages.UserPreferencesPage;
import Pages.UserProfilePage;
public class TC_Plan_Multiple_Cities_Vacation_TestCases extends Keyword{

	@BeforeMethod
	public void open_browser_and_Url() {
		openBrowser("Chrome");
		
	
		Keyword.waitTime();
		openURL("https://www.triphobo.com");
		Keyword.maximizeBrowser();

	}
	/*@AfterMethod
	public void close_browser() {
		closeBrowser();

	}
	@Test
	public void test_to_verify_Title_of_TripHobo(){
		Assert.assertEquals(Keyword.getTitle(),"Vacation Planner for Your Holidays: TripHobo","this is not matched");
		System.out.println(Keyword.getTitle());
	}*/
	
	@Test
	public void test_to_verify_Plan_Your_Multiple_City_Vacation() throws InterruptedException {
		LoginPage  login=PageFactory.initElements(Constant.driver, LoginPage .class);
		HomePage  home=PageFactory.initElements(Constant.driver, HomePage .class);
		TripPage trip=PageFactory.initElements(Constant.driver, TripPage .class);
		NightEditPage nights=PageFactory.initElements(Constant.driver, NightEditPage .class);
	//	PreferencesPage travelers=PageFactory.initElements(Constant.driver, PreferencesPage .class);
		TripPlannerPage plan=PageFactory.initElements(Constant.driver, TripPlannerPage .class);
		UserPreferencesPage user=PageFactory.initElements(Constant.driver, UserPreferencesPage .class);
		UserProfilePage profile=PageFactory.initElements(Constant.driver, UserProfilePage .class);
		Thread.sleep(2000);
	//	login.clickOnLogIn();
	//	login.clickOnLogInWithFacebook();
		home.clickOnPlanYourNextVacation();
		
		trip.enterWhereDoYouWantToGo("France");
		Thread.sleep(2000);
		trip.selectOptionWithText("France");
		//trip.selectOptionWithCity("Paris");
		
		for(int i=0; i<=2;i++){
			  try{
				  trip.selectOptionWithCity("Paris");
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}
		Thread.sleep(2000);
		trip.clickOnAnotherDestination();
		Thread.sleep(2000);
		
		
		trip.enterWhereDoYouWantToGo("England");
		Thread.sleep(2000);
		trip.selectOptionWithText("England");
		for(int i=0; i<=2;i++){
			  try{
				  trip.selectOptionWithCity("London");
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}
		Thread.sleep(1000);
		trip.clickOnSatrtDate();
		trip.selectStartDate();
		
		Thread.sleep(2000);
		trip.ClickOnEndDate();
		trip.selectEndDate();

	
		trip.clickOnStartPlanning();
		Thread.sleep(2000);
		System.out.println("Click on Plan your next vacation is successfully ");
		
		nights.clickOnNextPreferences();
		Thread.sleep(1000);
		System.out.println("Click on the next");
		Thread.sleep(3000);
		user.clickOnNextButton();
		Thread.sleep(2000);
		
		profile.clickOnVacationWidFamily();
		Thread.sleep(2000);
		profile.clickOnAdultPlus();
		Thread.sleep(1000);
		profile.clickOnKidsPlus();
		Thread.sleep(1000);
		profile.clickOnYear();
		Thread.sleep(1000);
		profile.clickOnKidsYear();
		Thread.sleep(1000);
		profile.clickOnNextOverview();
		Thread.sleep(2000);
	/*	travelers.clickOnTravelers();
		Thread.sleep(1000);
		
		travelers.incementAdults();
		Thread.sleep(1000);
		System.out.println("incement adults");
		
		travelers.incrementKids();
		Thread.sleep(1000);
		System.out.println("incement kids");
	
		travelers.clickOnNextOverview();
		Thread.sleep(10000);
		System.out.println("click On overview");
		*/
		
		//plan.closeDisclaimer();

		plan.clickOnEditableView();
		Thread.sleep(5000);
		System.out.println("click On edit plan");
		
		
	/*	plan.clickOnChange();
		Thread.sleep(5000);
		System.out.println("click On change plan");
		
		plan.clickOnFlyPuneToParis();
		Thread.sleep(5000);
		System.out.println("click On fly pune to paris");*/
	}
}