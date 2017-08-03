package com.cenonDay4;


public class App1 {
	
	protected static boolean printHello(int noOfTimes)
	{
		if(noOfTimes > 10)
			return false;
		try {
			if(noOfTimes<1) {
				return true;
			}
			int x= noOfTimes;
			System.out.println("Hello");
			return printHello(x-1);
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		printHello(5);
	}
}
