package pages;

import org.openqa.selenium.By;

import base.ControlActions;

public class AssessmentPage extends ControlActions {

	public int getTotalAssessmentCount() {
		String totalassesmentValue = driver.findElement(By.xpath("//label[contains(text(),'Assessments')]")).getText();
		int assessmentCount = Integer.parseInt(totalassesmentValue.split(" ")[1].replace("(", "").replace(")", ""));
		return assessmentCount;
	}
	
	public int getAssessmentCountBasedStatus(String assessmentStatus) {
		String assessmentCount= driver.findElement(By.xpath("//div/span[contains(text(),'"+assessmentStatus+"')]")).getText();
		int assessmentCountAsNumber = Integer.parseInt(assessmentCount.split(" ")[1].replace("(", "").replace(")", ""));
		return assessmentCountAsNumber;
	}
	
}
