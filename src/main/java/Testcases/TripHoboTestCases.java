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
public class TripHoboTestCases extends Keyword{

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
	/*@Test
	public void test_to_verify_Plan_Your_Single_City_Vacation() throws InterruptedException {
		
		
		
		HomePage  login=PageFactory.initElements(Constant.driver, HomePage .class);
		TripPage trip=PageFactory.initElements(Constant.driver, TripPage .class);
		NightEditPage nights=PageFactory.initElements(Constant.driver, NightEditPage .class);
		PreferencesPage travelers=PageFactory.initElements(Constant.driver, PreferencesPage .class);
		TripPlannerPage plan=PageFactory.initElements(Constant.driver, TripPlannerPage .class);
		login.clickOnPlanYourNextVacation();
		
		trip.enterWhereDoYouWantToGo("Lonavala");
		Thread.sleep(2000);
		trip.selectOptionWithText("Lonavala");
		
		Thread.sleep(2000);
		trip.clickOnSatrtDate();
		trip.selectStartDate();
		
		Thread.sleep(2000);
		trip.ClickOnEndDate();
		trip.selectEndDate();

	
		trip.clickOnStartPlanning();
		Thread.sleep(1000);
		System.out.println("Click on Plan your next vacation is successfully ");
	
		nights.clickOnNights();
		Thread.sleep(1000);
		
		nights.clickOnArriveTime();
		Thread.sleep(1000);
		
		nights.selectMorningTime();
		Thread.sleep(2000);
		System.out.println("Select the morning time");
		
		nights.clickOnDepartTime();
		Thread.sleep(1000);
		
		nights.selectAferTime();
		Thread.sleep(2000);
		System.out.println("Select the After 6 ");
		
		nights.clickOnSaveBtn();
		Thread.sleep(1000);
		System.out.println("Click on the save");
		
		nights.clickOnNextPreferences();
		Thread.sleep(1000);
		System.out.println("Click on the next");
		
		travelers.clickOnTravelers();
		Thread.sleep(1000);
		
		travelers.incementAdults();
		Thread.sleep(1000);
		System.out.println("incement adults");
		
		travelers.incrementKids();
		Thread.sleep(1000);
		System.out.println("incement kids");
	
		travelers.clickOnNextOverview();
		Thread.sleep(7000);
		System.out.println("click On overview");
		
		plan.closeDisclaimer();
		
		plan.clickOnEditableView();
		Thread.sleep(5000);
		System.out.println("click On edit plan");
		
		
		
		plan.clickOnAddDinner();
		Thread.sleep(2000);
		System.out.println("Add your dinner");
		
		plan.clickOnAddPlan();
		Thread.sleep(2000);
		System.out.println("Add your plan");
		
		plan.clickOnSavePlan();
		Thread.sleep(2000);
		System.out.println("click On save paln");
		
		plan.selectFinishPlanning();
		Thread.sleep(7000);
		System.out.println("click On finish plan");
	}*/
	
	@Test
	public void test_to_verify_Plan_Your_Multiple_City_Vacation() throws InterruptedException {
		LoginPage  login=PageFactory.initElements(Constant.driver, LoginPage .class);
		HomePage  home=PageFactory.initElements(Constant.driver, HomePage .class);
		TripPage trip=PageFactory.initElements(Constant.driver, TripPage .class);
		NightEditPage nights=PageFactory.initElements(Constant.driver, NightEditPage .class);
		PreferencesPage travelers=PageFactory.initElements(Constant.driver, PreferencesPage .class);
		TripPlannerPage plan=PageFactory.initElements(Constant.driver, TripPlannerPage .class);
		Thread.sleep(2000);
		login.clickOnLogIn();
		login.clickOnLogInWithFacebook();
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
		
		travelers.clickOnTravelers();
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
		
		plan.closeDisclaimer();

		plan.clickOnEditableView();
		Thread.sleep(5000);
		System.out.println("click On edit plan");
		
		plan.clickOnChange();
		Thread.sleep(5000);
		System.out.println("click On change plan");
		
		plan.clickOnFlyPuneToParis();
		Thread.sleep(5000);
		System.out.println("click On fly pune to paris");
	}
}