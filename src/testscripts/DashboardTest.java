package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AssessmentPage;

public class DashboardTest extends TestBase{
	
	@Test 
	void verifyAssesmentCount() {
		
		System.out.println("STEP - Go to Assessments Tab");
		dashboardPage.navigateTo("Assessments");
		
		System.out.println("Step - Get total Assesment On Assesment Tab");	
		AssessmentPage assessmentPage = new AssessmentPage();
		int assesmentCountOnAssessementPage = assessmentPage.getTotalAssessmentCount();
		
		System.out.println("Step - Get published Assessments count");
		int toalpublishedElementCount= assessmentPage.getAssessmentCountBasedStatus("published");
		
		System.out.println("Step - Get completed Assessment count");
		int toalcompletedElementCount = assessmentPage.getAssessmentCountBasedStatus("completed");
		
		System.out.println("Step - Get draft Assessment count");
		int toaldraftElementCount = assessmentPage.getAssessmentCountBasedStatus("draft");
		
		System.out.println("VERIFY - Total Assessments on assessment page should be equal to sum of published, completed and draft count.");
		int assesmentCountTotal = toalpublishedElementCount + toalcompletedElementCount + toaldraftElementCount;
		System.out.println("Total of assesment " + assesmentCountTotal);
		Assert.assertEquals(assesmentCountOnAssessementPage, assesmentCountTotal);
		
		System.out.println("STEP - Go to Dashboard page");
		dashboardPage.navigateTo("Dashboard");
		dashboardPage.waitForPageLoad();
		
		System.out.println("STEP - Get Total Assessments on Dashboard page");
		int assesmentCountonDashboard = dashboardPage.getTotalAssessmentsCount();
		System.out.println("Assesment count on Dashboard " + assesmentCountonDashboard);
		
		System.out.println("VERIFY - Total assessments count on dashboard page against Assessments tab.");
		Assert.assertEquals(assesmentCountOnAssessementPage, assesmentCountonDashboard);
		
		int recentAssessmentCount = dashboardPage.getRecentAssessmentCount();
		if(assesmentCountonDashboard >= 6) {
			System.out.println("VERIFY - recent assessments count should be 6");
			Assert.assertEquals(recentAssessmentCount,6);
		}else {
			System.out.println("VERIFY - Recent assessments should match the total assesement count");
			Assert.assertEquals(recentAssessmentCount,assesmentCountonDashboard);
		}
	}
	
}
	