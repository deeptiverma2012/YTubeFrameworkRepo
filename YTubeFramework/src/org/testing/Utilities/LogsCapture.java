package org.testing.Utilities;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;

public class LogsCapture {
	
	public static void takeLogs(String classname, String message)
	{
		DOMConfigurator.configure("C:/Users/Ashish/git/FrameworkRepo/YTFramework/layout.xml"); 
		Logger l = 	Logger.getLogger(classname);
		l.info(message);
	}

}
