package org.testing.Pages;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties Pr;
	
	public Login(ChromeDriver driver, Properties Pr)
	{
		this.driver = driver;
		this.Pr = Pr;		
	}		
	public void sigin(String usrname, String Passwd) throws InterruptedException
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
	}

}
