package com.testing.junit.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class SomeDataServiceStub implements SomeDataService
{

	@Override
	public int[] getAlldata() {
		
		return new int[] {1,3,2};
	}
	
}
class SomeDataServiceStub_empty implements SomeDataService
{

	@Override
	public int[] getAlldata() {
		
		return new int[] {  };
	}
	
}
class SomeDataServiceStub_oneValue implements SomeDataService
{

	@Override
	public int[] getAlldata() {
		
		return new int[] {6};
	}
	
}




public class SomeBuisnessStubTest {

	

	@Test
	public void testCalculateSumUSingDataService_basic()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		buisnessImpl.setSomeDataservice(new SomeDataServiceStub());
		int actualResult=buisnessImpl.calculateSumUsingDataService();
		int expectedResult=6;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSumUSingDataService_empty()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		buisnessImpl.setSomeDataservice(new SomeDataServiceStub_empty());
		int actualResult=buisnessImpl.calculateSumUsingDataService();
		int expectedResult=0;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCalculateSumUSingDataService_oneValue()
	{
		SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();
		buisnessImpl.setSomeDataservice(new SomeDataServiceStub_oneValue());
		int actualResult=buisnessImpl.calculateSumUsingDataService();
		int expectedResult=6;
		
		assertEquals(expectedResult, actualResult);
	}
}















