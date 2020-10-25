package org.testing.TestScripts;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC10 extends Base  {
	
		
	@Test
	public void LoginSearchPlay() throws InterruptedException
	{		
		WebElement signin =driver.findElement(By.xpath(Pr.getProperty("signin")));
		signin.click();			
		Thread.sleep(2000);		
		WebElement username = driver.findElement(By.xpath(Pr.getProperty("username")));		
		Thread.sleep(2000);		
		username.sendKeys(Pr.getProperty("id"));		
		WebElement nxtbtn = driver.findElement(By.xpath(Pr.getProperty("nxtbtn")));
		nxtbtn.click();		
		Thread.sleep(5000);		
		WebElement passwd = driver.findElement(By.xpath(Pr.getProperty("passwd")));
		passwd.sendKeys("Deep@123");		
		WebElement nextbn1 = driver.findElement(By.xpath(Pr.getProperty("nextbn1")));
		nextbn1.click();
		Thread.sleep(5000);				
			
			Actions act = new Actions(driver);
			WebElement searchbox = driver.findElement(By.xpath(Pr.getProperty("searchbox")));
			searchbox.click();
			searchbox.sendKeys("a");
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0, 250)");
			
			Thread.sleep(2000);
			WebElement wb = driver.findElement(By.xpath(Pr.getProperty("enteredtext")));
			act.moveToElement(wb).click().perform();
			
			//WebElement searchIcon =	driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
			Thread.sleep(2000);
			WebElement firstVideo = driver.findElement(By.xpath(Pr.getProperty("fvideo")));
			firstVideo.click();
						    
			
			Thread.sleep(2000);
		    WebElement profile = driver.findElement(By.xpath(Pr.getProperty("profile")));
		    profile.click();
		    
		    Thread.sleep(5000);
		    
		    WebElement signoutbtn = driver.findElement(By.xpath(Pr.getProperty("signoutbtn")));
		    
		    signoutbtn.click();
	}	
	
	
	

}
