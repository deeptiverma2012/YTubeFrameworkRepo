package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	public static void TakeScreenshot(ChromeDriver driver, String path)
	{
	File f = driver.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(f, new File(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
