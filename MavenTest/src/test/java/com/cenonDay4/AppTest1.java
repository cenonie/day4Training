package com.cenonDay4;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest1 {

	@Test
	public void test() {
		if(App1.printHello(10) == false)
		{
			System.out.println("hello");
			fail("test failed");
		}
	}
}
