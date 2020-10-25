package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;	
	public Properties Pr;
	
	@BeforeMethod
	public void befrTest() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		File f = new File("C:\\Users\\Ashish\\git\\FrameworkRepo\\YTFramework\\Element.properties");
		FileInputStream Fi = new FileInputStream(f);
		
		Pr = new Properties();
		Pr.load(Fi);
	}	

	@AfterMethod
	public void aftrTest()
	{
		driver.close();
	}
	
}
