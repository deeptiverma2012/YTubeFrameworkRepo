package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayVideo {
ChromeDriver driver;
Properties Pr;

public PlayVideo(ChromeDriver driver,Properties Pr)
{
	this.driver = driver;
	this.Pr = Pr;
}

	
	public void VideoPlay(String listelement , String firstvideo) throws InterruptedException
	{
		List<WebElement> li = driver.findElements(By.xpath(Pr.getProperty("listelement")));
		 li.get(0).click();
		 Thread.sleep(5000);
		
			System.out.println("Video Played");		
		 
			WebDriverWait wait = new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Pr.getProperty("firstvideo"))));
	}
}
