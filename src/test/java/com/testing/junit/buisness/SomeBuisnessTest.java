package com.testing.junit.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBuisnessTest {

	
//-------------------------------Simple test cases where we are giving data Manually----------------------------------------
	@Test
	public void testCalculateSum_basic()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		
		int actualResult=buisnessImpl.calculateSum(new int [] {1,2,3});
		int expectedResult=6;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSum_emplty()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		
		int actualResult=buisnessImpl.calculateSum(new int [] {   });
		int expectedResult=0;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSum_oneValue()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		
		int actualResult=buisnessImpl.calculateSum(new int [] {  8 });
		int expectedResult=8;
		
		assertEquals(expectedResult, actualResult);
	}
}
//______________________________________________________________________________________________________________________















