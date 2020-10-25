package org.testing.TestScripts;
import java.awt.Desktop.Action;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.DateCalculator;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base {
	

	@Test
	public void youtubeLogin() throws InterruptedException
	{		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");
		String expectedUrl = "https://www.youtube.com/";
		
		LogsCapture.takeLogs("TC1", "TC1 passed successfully!");
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
		
		
		WebElement trending = driver.findElement(By.xpath(Pr.getProperty("trending")));
		trending.click();
		
		LogsCapture.takeLogs("TC1", "Clicked on Trending");
		
		Thread.sleep(2000);	
		
		String Filename = "C://Screenshots//Screenshot"+DateCalculator.calculate_date();
		
		ScreenshotCapture.TakeScreenshot(driver, Filename);
		System.out.println("Screenshot Captured");
	
		 
		 Logout lgout = new Logout(driver, Pr);
		 lgout.logout();
		 
		 //lgout.logout("//yt-formatted-string[text() ='Sign out']" , "//img[@alt='Avatar image']");
		    
		
	}	
	
	
	

}
