package org.testing.TestScripts;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.PlayVideo;
import org.testing.Utilities.DateCalculator;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC9 extends Base  {
	
	
	@Test
	public void LoginPlayVideoComment() throws InterruptedException
	{	
		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");	
		
		PlayVideo plvdo = new  PlayVideo(driver, Pr);
		plvdo.VideoPlay("//yt-formatted-string[@id='video-title']" , "//yt-icon[@class = 'style-scope ytd-toggle-button-renderer'][1]");
		
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			System.out.println("Window Scrolled");
			
			
			String Filename = "C://Screenshots//Screenshot"+DateCalculator.calculate_date();
			
			ScreenshotCapture.TakeScreenshot(driver, Filename);
			System.out.println("Screenshot Captured");
			
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='contenteditable-root]")));
			WebElement comment = driver.findElement(By.xpath("//div[@id='contenteditable-root']"));
			
			
			
			Actions act = new Actions(driver);
			act.moveToElement(comment).click().sendKeys("Interesting").build().perform();
			//comment.click();
			//Thread.sleep(2000);
			
			//comment.sendKeys("Interesting");
			
			WebElement cmtbtn = driver.findElement(By.xpath("//paper-button[@aria-label='Comment']"));
			
			cmtbtn.click();				
		
		    
			 Logout lgout = new Logout(driver, Pr);
			    
			 lgout.logout();
			    
	}	
	
	
	
	

}
