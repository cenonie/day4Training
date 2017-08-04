package com.cenonDay5;

import static org.junit.Assert.*;

import org.junit.Test;
import com.cenonDay5.ExamsDay5;

public class ExamsTest {

	@Test
	public void test() {
		assertEquals(5, ExamsDay5.number7(60));
	}
	
	@Test
	public void test2() {
		int[] array = {1,2,4,8,10,1};
		int[] array2 = new int[6];
		for(int x=0; x<6; x++)
		{
			array2[x] = array[x]%2;
		}
		int[] array3 = {1,0,0,0,0,1};
		assertArrayEquals(array3,array2);
	}

	@Test
	public void test3() {
		int[] testArray = ExamsDay5.number1();
		int[] arrayResult = {13,175,123};
		assertArrayEquals(arrayResult,testArray);
		
	}
	
	@Test
	public void test4() {
		assertEquals(ExamsDay5.number10e(), "acartcartoon");
	}
}
