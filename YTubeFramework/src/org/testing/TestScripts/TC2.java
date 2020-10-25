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

public class TC2 extends Base {
	
		
	
	@Test
	public void LoginHistory() throws InterruptedException
	{		
		Login log = new Login(driver, Pr);
		log.sigin("deepautomationtesting@gmail.com", "Deep@123");	
		
		Thread.sleep(3000);
		
	    WebElement hstry = driver.findElement(By.xpath(Pr.getProperty("history")));
	    hstry.click();
	    Thread.sleep(3000);
	    
	       
	    
	    Logout lgout = new Logout(driver, Pr);
	    
	    lgout.logout();
		
	    
			
	}	
	

}
