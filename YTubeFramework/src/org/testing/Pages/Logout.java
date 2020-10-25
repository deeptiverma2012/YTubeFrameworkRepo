package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver driver;
	Properties Pr;
	
public Logout(ChromeDriver driver, Properties Pr)	
{
	this.driver = driver;
	this.Pr = Pr;
}

public void logout() throws InterruptedException
{
	
	WebElement prfle = driver.findElement(By.xpath(Pr.getProperty("profile")));
	 prfle.click();
    
    Thread.sleep(5000);
    
	WebElement signoutbttn = driver.findElement(By.xpath(Pr.getProperty("signoutbtn")));
    
	signoutbttn.click();
	
	System.out.println("Succesfully logout");
}

}
