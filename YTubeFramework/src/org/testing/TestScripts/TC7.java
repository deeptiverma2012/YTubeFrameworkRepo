package org.testing.TestScripts;
import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
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

public class TC7 extends Base  {
		
	@Test
	public void LoginPlayVideoLike() throws InterruptedException
	{		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");	
		
		PlayVideo plvdo = new  PlayVideo(driver, Pr);
		plvdo.VideoPlay("//yt-formatted-string[@id='video-title']" , "//yt-icon[@class = 'style-scope ytd-toggle-button-renderer'][1]");
		 
			WebElement likebtn = driver.findElement(By.xpath(Pr.getProperty("likebtn")));
			likebtn.click();
			System.out.println("Video Liked");
		
		 	Thread.sleep(3000);
		    
		 	 Logout lgout = new Logout(driver, Pr);
			    
			 lgout.logout();
	}	
	
	
	
	

}
