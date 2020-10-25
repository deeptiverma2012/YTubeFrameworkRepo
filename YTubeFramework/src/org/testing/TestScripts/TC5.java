package org.testing.TestScripts;
import java.awt.Desktop.Action;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base {
	
	
	@Test
	public void LoginWatchlater() throws InterruptedException
	{		
		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");			
		
	    WebElement WatchLater = driver.findElement(By.xpath(Pr.getProperty("watchlater")));
	    WatchLater.click();
	    Thread.sleep(3000);
	    
	    Logout lgout = new Logout(driver, Pr);
	    
	    lgout.logout();
		    
	    
	    
		
	}	
	
	
	
	

}
