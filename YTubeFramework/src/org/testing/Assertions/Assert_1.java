package org.testing.Assertions;

public class Assert_1 {
	
	public static void assertion1(String exp,String actual )
	{
		if(exp.equals(actual))
		{
			System.out.println("Assertion Passed");
		}
		else
		{
			System.out.println("Assertion Failed");
		}
	}

}
