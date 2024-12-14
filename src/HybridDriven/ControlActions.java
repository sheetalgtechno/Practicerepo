package HybridDriven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlActions {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static void start(String url){
		System.out.println("STEP - Launch browser");
		driver = new ChromeDriver();
		
		System.out.println("STEP - Load url");
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	public static WebElement getElement(String locatorType, String locatorValue, boolean isWaitRequired){
		WebElement e = null;
					
		switch(locatorType.toUpperCase()){
			case "XPATH":
				if(isWaitRequired){
					e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
				}else{
					e = driver.findElement(By.xpath(locatorValue));
				}
				break;
				
			case "ID":
				if(isWaitRequired){
					e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
				}else{
					e = driver.findElement(By.id(locatorValue));
				}
				break;
			
			case "NAME" : 
				if(isWaitRequired){
					e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
				}else{
					e = driver.findElement(By.name(locatorValue));
				}
				break;
				
			case "LINKTEXT" : 
				if(isWaitRequired){
					e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
				}else{
					e = driver.findElement(By.linkText(locatorValue));
				}
				break;	
				
			default : 
				//throw new InvalidLocatorException("Valid locators are ID, NAME, XPATH ...., but you have passed " + locatorType  + " which is not supported");
		}
		return e;
	}
	
	public static void takeScreenshot(String ssFileName) {
		TakesScreenshot scr =(TakesScreenshot)driver;
		File scrFile= scr.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(".//screenshots/"+ssFileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
}
