package org.testing.Utilities;

import java.text.DateFormat;
import java.util.Date;

public class DateCalculator {
	
	public static String calculate_date()
	{
		DateFormat df = DateFormat.getDateInstance();
		Date d = new Date();		
		String s = df.format(d);
		return s;
	}

}
