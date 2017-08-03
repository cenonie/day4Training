package com.cenonDay4;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest1 {

	@Test
	public void test() {
		if(App1.printHello(10) == false)
			fail("test failed");
	}

}
