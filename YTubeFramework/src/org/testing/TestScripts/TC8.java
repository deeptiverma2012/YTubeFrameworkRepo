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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends Base  {
	
	
		
	@Test
	public void LoginPlayVideoSubscribe() throws InterruptedException
	{		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");	
		Thread.sleep(5000);	
			
		PlayVideo plvdo = new  PlayVideo(driver, Pr);
		plvdo.VideoPlay("//yt-formatted-string[@id='video-title']" , "//yt-icon[@class = 'style-scope ytd-toggle-button-renderer'][1]");
		
		
			System.out.println("Video Played");	
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			System.out.println("Window Scrolled");
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Pr.getProperty("subscribe"))));
			WebElement subscrb = driver.findElement(By.xpath(Pr.getProperty("subscribe")));
			subscrb.click();	 			
					
			System.out.println("Video Suscribed");
			Thread.sleep(3000);	 	
		    
			WebElement Cncl = driver.findElement(By.xpath(Pr.getProperty("Cancel")));
			Cncl.click();
			
			 Logout lgout = new Logout(driver, Pr);
			    
			 lgout.logout();
	}	

	
	
	

}
