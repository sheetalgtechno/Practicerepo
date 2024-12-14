package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ControlActions;

public class DashboardPage extends ControlActions{
	private String recentAssessment = "//span[contains(text(),'Recent Assessments (')]";
	
	public boolean isDashboardMenuDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dashboardElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
		return dashboardElement.isDisplayed();
	}
	
	public void navigateTo(String menuText) {
		String menuLocator = "//span[text()='"+menuText+"']";
		WebElement menuElement = getElement("XPATH", menuLocator, true);
		menuElement.click();
	}
	
	public void waitForPageLoad() {
		getElement("XPATH", recentAssessment, true);
	}
	
	public int getTotalAssessmentsCount() {
		String assesmentValueonDashboard = driver.findElement(By.xpath("//div/span[contains(text(),'Total Assessments')]/b")).getText();
		int assesmentCountonDashboard= Integer.parseInt(assesmentValueonDashboard);
		return assesmentCountonDashboard;
	}
	
	public int getRecentAssessmentCount() {
		String recentAssessmentCountText = driver.findElement(By.xpath(recentAssessment)).getText();
		String[] arr = recentAssessmentCountText.replace("(", "").replace(")","").trim().split(" ");
		int  recentAssessmentCount = Integer.parseInt(arr[arr.length-1]); // Recent Assessments 2 	
		return recentAssessmentCount;
	}
}
