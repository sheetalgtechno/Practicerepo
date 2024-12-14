package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ControlActions;

public class LoginPage extends ControlActions {

		private String emailLocator = "//input[@placeholder='Enter email']";
		private String passwordLocator = "//input[@placeholder='Enter password']";
		private String loginLocator  = "//button[text()='Login']";

		public boolean isEmailIdFieldDisplayed() {
			WebElement emailFieldLocator = driver.findElement(By.xpath(emailLocator));
			return emailFieldLocator.isDisplayed();
		}

		public boolean isPasswordFieldDisplayed() {
			WebElement passwordFieldLocator = driver.findElement(By.xpath(passwordLocator));
			return passwordFieldLocator.isDisplayed();
		}

		public boolean isLoginBtnDisplayed() {
			WebElement loginBtnLocator = driver.findElement(By.xpath(loginLocator));
			return loginBtnLocator.isDisplayed();
		}
		
		public void login(String emailId, String password) {
			enterEmail(emailId);
			enterPassword(password);
			clickOnLoginBtn();
		}

		public void enterEmail(String emailId) {
			WebElement emailFieldLocator = driver.findElement(By.xpath(emailLocator));
			emailFieldLocator.sendKeys(emailId);
		}

		public void enterPassword(String password) {
			WebElement passwordFieldLocator = driver.findElement(By.xpath(passwordLocator));
			passwordFieldLocator.sendKeys(password);
		}

		public void clickOnLoginBtn() {
			WebElement loginBtnLocator = driver.findElement(By.xpath(loginLocator));
			loginBtnLocator.click();
		}
		
		public String getPopupMessage() {
			WebElement popUpmessageElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div[2]//div[@role='alert'][1]/div")));
			String actualPopUpMsg = popUpmessageElement.getText();
			return actualPopUpMsg;
		}
	}
	


