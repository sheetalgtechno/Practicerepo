package testscripts;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.ControlActions;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest {
	
	@BeforeMethod
	public void setup() {
		ControlActions.start("https://staging.theeliteqa.com/login");
	}
	
	@Test
	public void TestLoginFunctionality() {
		System.out.println("VERFIY - Login page is visible [Login button is displayed, useremail is enabled, password is enabled]");
		LoginPage loginPage = new LoginPage();
		boolean emailFieldFlag = loginPage.isEmailIdFieldDisplayed();
		boolean passwordFieldFlag = loginPage.isPasswordFieldDisplayed();
		boolean loginBtnFlag = loginPage.isLoginBtnDisplayed();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(emailFieldFlag, "email field was not displayed");
		softAssert.assertTrue(passwordFieldFlag, "password field was not displayed");
		softAssert.assertTrue(loginBtnFlag, "login button was not displayed");
		softAssert.assertAll();
		System.out.println("all 3 elements is displayed on login page");
		
		System.out.println("STEP 3 - Enter valid username");
		loginPage.enterEmail("sheetalgawande07@gmail.com");
		
		System.out.println("STEP 4 - Enter valid password");
		loginPage.enterPassword("May@123");
		
		System.out.println("STEP 5 - Click on Login button");
		loginPage.clickOnLoginBtn();
		
		System.out.println("VERIFY - Dashboard page is displayed");
		DashboardPage dashboardElement = new DashboardPage();
		boolean dashboardMenuFlag = dashboardElement.isDashboardMenuDisplayed();
		Assert.assertTrue(dashboardMenuFlag, "Dashboard menu was not displayed");
	} 
	
	
	@Test
	public void verifyInvalidAuthantication() {
		LoginPage loginPage = new LoginPage();
		
		System.out.println("STEP 3 - Enter valid username");
		loginPage.enterEmail("sheetalgawande07@gmail.com");
		
		System.out.println("STEP 4 - Enter Invalid password");
		loginPage.enterPassword("May@1234");
		
		System.out.println("STEP 5 - Click on Login button");
		loginPage.clickOnLoginBtn();
		
		System.out.println("VERIFY - Popup with the error message");
		String actualPopUpMsg = loginPage.getPopupMessage();
		String expectedPopUpMsg = "Authentication failed, please check your username and password.";
		Assert.assertEquals(actualPopUpMsg, expectedPopUpMsg);
		
		System.out.println("VERIFY - Login page is still visible.");
		boolean loginBtnFlag = loginPage.isLoginBtnDisplayed();
		Assert.assertTrue(loginBtnFlag, "Login button was not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("CLEAN UP - closing all browsers");
		ControlActions.quitBrowser();
	}
}
