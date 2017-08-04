package com.cenonDay5;

import java.util.Scanner;

public class ExamsDay5 {

	protected static int[] number1() {
		int i = 1;
		int[] arrayResult = new int[3];
		for(int j=0; j<5; j+=2) {
			i = (i*i) + j;
		}
		switch (i)  
		{ 
		   case 3: 
		     System.out.println ("zero"); 
		    break; 
		   case 13: 
		     arrayResult[0] = 13;
		     System.out.println ("one");
		   case 175: 
			 arrayResult[1] = 175;
			 System.out.println ("two");
		   default: 
			 arrayResult[2] = 123;
			 System.out.println ("default");
		}
		return arrayResult; 
	}
	
	protected static void number2(int input) {
		int n = input; 
		int F_0=1,F_1=1; 
		int F_n=0; 
		System.out.println ("Enter the number");
//		Scanner scan = new Scanner (System.in);
//		n = scan.nextInt();
		for (int i=1; i<n; i++) 
		{ 
		  F_n=F_0+F_1; 
		  F_0=F_1; 
		  F_1=F_n; 
		  System.out.println(F_n + " " + F_0 + " " + F_1);
		} 
		System.out.println (F_n); 
	}
	
	protected static void number3()
	{
		int inner=2, outer=2; 
		int result=0; 
		 
		for (int i=0; i<outer; i++) 
		{ 
		  for (int j=0; j<inner; j++) 
		      { 
		        result = (result*result)+1;
		      } 
		} 
		System.out.println(result);
	}
	
	protected static void number3inWhile()
	{
		int inner=2, outer=2; 
		int result=0;
		
		int i = 0; 
		while(i<outer)
		{
			int j=0;
			while(j<inner)
			{
				result = (result*result)+1;
				j++;
			}
			i++;
		}
		System.out.println(result);
	}
	
	protected static void number4() {
		 int x = 3; 
		 int y = 10; 
		 while (x < y) 
		   {System.out.println ("Hello"); 
		     x = x + 1; 
		     y = y - 1; 
		   } 
	}
	
	protected static int number7(int integer_value) {
		boolean done = false;  
		int count = 1;  
		int current = integer_value + 2;  
		while (! done) {  
		  current = current / count;  
		  if (current % 3 == 0)  
		    done = true;  
		  else if (current < 1)  
		    done = true;  
		  else  
		    count += 1;  
		  System.out.println(current);  
		}  
		System.out.println (count);
		return count;  
	}
	
	protected static void number10a() {
		double count; 
		int limit; 
		count = 9.0; 
		limit = 43/4; 
		for (; count <= limit; count = count + 0.5) 
		{ 
		  System.out.println ("in for:" + count); 
		} 
		System.out.println ("after for" + count); 
	}
		
	static int value = 10; 
	protected static void number10b() {
		System.out.println("Main before p1: " + value); 
		value = p1(value); 
		System.out.println("Main before p2: " + value); 
		value = p2(value); 
		System.out.println("Main at the end: " + value); 
		System.out.println("-----"); 
		int value = 30; 
		System.out.println("Main before p1: " + value); 
		value = p1(value); 
		System.out.println("Main before p2: " + value); 
		value = p2(value); 
		System.out.println("Main at the end: " + value); 
	}
	static int p1(int input) 
	{ 
	  value = input * value; 
	  System.out.println("In p1: " + value); 
	  return value; 
	} 
	static int p2(int input) 
	{ 
	  int value = 5; 
	  value = input / value; 
	  System.out.println("In p2: " + value); 
	  return value; 
	} 
	
	
	protected static void number10c() {
		int value = 5; 
		int value2 = 1; 
		while (value2 < 4) 
		{ 
		  for (;value >= value2; value--) 
		  { 
		    System.out.println("*"); 
		  } 
		  value2++; 
		} 
	}
	
	static boolean a,b,c; 
	protected static void number10d() {
		a = true; 
		b = false; 
		c = false; 
		System.out.println (a + ", " + b + ", " + c); 
		do 
		{ 
		   
		  if (b == c) 
		    b = a; 
		  else if (a == c) 
		    b = c; 
		  else 
		    a = c; 
		  System.out.println(a + ", " + b + ", " + c); 
		} 
		while ( a || b || c); 	
	}
	
	protected static String number10e() {
		int one = 1; /* type a value here */; 
		int two = 2;/* type a value here */; 
		int three = 3;  /* type a value here */; 
		String string = ""; 
		do 
		{ 
		  one++; 
		  string+="cart"; 
		} 
		while ( one < 3); 
		for (int i = 0; i < two; i++) 
		{ 
		  string+="o";
		} 
		while (true) 
		{ 
		  three++; 
		  if (three == 5) 
		  { 
		    break; 
		  } 
		  string+="n"; 
		}  
		return string;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		number1();
//		number2();
//		number3();
//		number3inWhile();
//		number4();
		number7(60);
//		number10a();
//		number10b();
//		number10c();
//		number10d();
//		number10e();
		
	}

}
