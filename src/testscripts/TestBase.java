package testscripts;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.ControlActions;
import pages.DashboardPage;
import pages.LoginPage;

public class TestBase {
	DashboardPage dashboardPage;
	
	@BeforeMethod
	public void setup() {
		ControlActions.start("https://staging.dev.theeliteqa.com");
		LoginPage loginPage = new LoginPage();
		loginPage.login("sheetalgawande07@gmail.com", "May@123");
		dashboardPage = new DashboardPage();
		Assert.assertTrue(dashboardPage.isDashboardMenuDisplayed());
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==result.FAILURE) {
			System.out.println(result.getName() +" for this screenshot taken for failure ");
			ControlActions.takeScreenshot(result.getName());
		}
		ControlActions.quitBrowser();
	}
}
